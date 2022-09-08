package leetCode;

import java.util.LinkedList;

/*
* 二叉树的实现案例
* 1.建立节点类型；
* 2.建立一棵树
* 3.实现前序遍历
* 4.实现中序遍历
* 5.实现后序遍历
* */
public class Tree {
    public TreeNode createTree(){
        TreeNode A = new TreeNode('a');
        TreeNode B = new TreeNode('b');
        TreeNode C = new TreeNode('c');
        TreeNode D = new TreeNode('d');
        TreeNode E = new TreeNode('e');
        TreeNode F = new TreeNode('f');
        TreeNode G = new TreeNode('g');
        TreeNode H = new TreeNode('h');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.left = H;
        C.right = G;
        C.left = F;
        return A;
    }

    void preOrder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    void midOrder(TreeNode root){
        if (root==null){
            return;
        }
        midOrder(root.left);
        System.out.print(root.val + " ");
        midOrder(root.right);
    }
    void lastOrder(TreeNode root){
        if (root == null){
            return;
        }
        lastOrder(root.left);
        lastOrder(root.right);
        System.out.print(root.val + " ");
    }
//    计算节点个数；
    int getSize(TreeNode root){
        if (root==null){
            return 0;
        }
        return getSize(root.left) + getSize(root.right) +1 ;
    }
//    计算叶子结点个数
    int getLeafSize(TreeNode root){
        if (root==null){
            return 0;
        }
        if (root.left ==null && root.right == null){
            return 1;
        }
        return getLeafSize(root.left) + getLeafSize(root.right);
    }
//    求第k层的节点个数
    int getKLevelSize(TreeNode root,int k){
        if (root == null){
            return 0;
        }
        if (k == 1){
            return 1;
        }
        return getKLevelSize(root.left, k-1) +getKLevelSize(root.right,k-1);
    }
//    获取二叉树的高度
    int getHight(TreeNode root){
        if (root == null)
            return 0;
        int leftTree = getHight(root.left);
        int righTree =getHight(root.right);
        return ((leftTree > righTree)? leftTree + 1 : righTree + 1);
    }
//   查找val所在的节点，没有返回null
    boolean finVal(TreeNode root, char val){
        if (root == null){
            return false;
        }
        if (root.val == val){
            return true;
        }
        if (finVal(root.left,val))
            return true;

        if(finVal(root.right,val))
            return true;
        return false;
    }
//    二叉树的层序遍历
    void levelOrder(TreeNode root){
        if (root == null){
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode top =queue.poll();
            System.out.print(top.val + " ");
            if (top.left != null){
                queue.offer(top.left);
            }
            if (top.right !=null){
                queue.offer(top.right);
            }
        }
        System.out.println();
    }
//    判断一棵树是不是完全二叉树
    boolean isCompleteTree(TreeNode root){
        if (root == null){
            return true;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode top = queue.poll();
            if(top != null){
                queue.offer(top.left);
                queue.offer(top.right);
            }else
                break;
        }
        while(!queue.isEmpty()){
            TreeNode cur = queue.peek();
            if (cur == null){
                queue.poll();
            }else {
                return false;
            }
        }

        return true;
    }



    public static void main(String[] args) {
        Tree tree = new Tree();
        TreeNode root = tree.createTree();
        System.out.println("前序遍历");
        tree.preOrder(root);
        System.out.println();
        System.out.println("中序遍历");
        tree.midOrder(root);
        System.out.println();
        System.out.println("后序遍历");
        tree.lastOrder(root);
        System.out.println();
        System.out.println("二叉树的节点个数: " + tree.getSize(root));
        System.out.println("二叉树的叶子结点个数: " + tree.getLeafSize(root));
        System.out.println("二叉树第k层节点个数： " + tree.getKLevelSize(root, 2));
        System.out.println("二叉树的高度： " + tree.getHight(root));
        System.out.println("查找具体某个节点： " +tree.finVal(root,'X'));
        System.out.println("层序遍历");
        tree.levelOrder(root);
        System.out.println(tree.isCompleteTree(root));
    }

}

class TreeNode{
    public  char val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(char val){
        this.val = val;
    }
}


