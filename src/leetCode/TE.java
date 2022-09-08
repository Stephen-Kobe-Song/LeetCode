package leetCode;

import java.util.*;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: leetCode
 * @Author: song
 * @CreateTime: 2022-05-28  02:55
 * @Description: TODO
 * @Version: 1.0
 */

//给定一张包含N个点、M条边的无向图，每条边连接两个不同的点，且任意两点间最多只有一条边。对于这样的简单无向图，如果能将所有点划分成若干个集合，使得任意两个同一集合内的点之间没有边相连，任意两个不同集合内的点之间有边相连，则称该图为完全多部图。现在你需要判断给定的图是否为完全多部图。
    // 现有n个物品，每个物品有三个参数 ai , bi , ci ，定义i物品不合格品的依据是 : 若存在物品 j , 且aj>ai , bj>bi , cj>ci，则称i物品为不合格品。
//
//现给出n个物品的a,b,c参数，请你求出不合格品的数量。
public class TE {
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 点的个数
        int M = in.nextInt(); // 边的个数
        int[][] a = new int[N+1][N+1];
        // 输入边的关系，并对数据进行初始化，相连的边对应的二维数组元素设置为1
        for (int i = 0; i < M; i++) {
            int row = in.nextInt();
            int wid = in.nextInt();
            a[row][wid] = 1;
            a[wid][row] = 1;
        }
        // 对二维数据a进行遍历，将二维数组中为0的点放入到集合中去
        ArrayList<Set<Integer>> list = new ArrayList<>();//存放没有连接关系的点的集合
        int[] point= new int[N+1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <=N ; j++) {
                if (i==j){
                    continue;
                }
                if (a[i][j] == 0){
                    if (list.isEmpty()){
                        HashSet<Integer> set = new HashSet<>();
                        set.add(i);
                        set.add(j);
                        list.add(set);
                    }else {
                        int count = 0;
                        for (Set set:list){
                            if (set.contains(i) || set.contains(j)){
                                set.add(i);
                                set.add(j);
                                break;
                            }else {
                                count++;
                            }
                        }
                        if (count == list.size()){
                            HashSet<Integer> set = new HashSet<>();
                            set.add(i);
                            set.add(j);
                            list.add(set);
                        }
                    }

                }else {
                    point[i]++;
                }
            }
        }
        for (int i = 1; i <point.length ; i++) {
            if (point[i] == N-1){
                HashSet<Integer> set = new HashSet<>();
                set.add(0);
                list.add(set);
            }
        }
        ArrayList<Integer> points = new ArrayList<Integer>();//这个list纯粹是为了将set集合对应的个数放到points中
        for (Set set:list) {
            points.add(set.size());
        }
        Integer[] results = new Integer[list.size()];
        results=points.toArray(results);//将points数组转换为results数组
        int result = 0;
        for (int i = 0; i <results.length ; i++) {//遍历results数组，根据补图点的个数关系，计算出不连接的集合之间应该连多少条边
            for (int j = i+1; j <results.length ; j++) {
                result+=results[i]*results[j];
            }
        }
        if (result == M) {//如果计算出来的数字result和输入的M相同，则输出Yes
            System.out.println("Yes");
        } else {//如果不是则输出No
            System.out.println("No");
        }
    }*/
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int n = in.nextInt();
        in.nextLine();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        for (int i = 0; i < n; i++) {
            String[] line = in.nextLine().split(" ");
            x[i] = Integer.parseInt(line[0]);
            y[i] = Integer.parseInt(line[1]);
            z[i] = Integer.parseInt(line[2]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (x[j] > x[i] && y[j] > y[i] && z[j] > z[i]){
                    ++count;
                    break;
                }
            }

        }
        System.out.println(count);
    }*/

    public static void main(String[] args) {
        HashMap<Integer, String > map = new HashMap<>();
        map.put(1,"song");
        map.put(2,"yin");
        map.put(3,"zhong");
        String name ="";
        Set<Integer> set = map.keySet();
        for (Integer in : set){
             name += map.get(in);
        }
        System.out.println(name);
        ;
    }

 /*   public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("song");
        list.add("yin");
        list.add("zhong");
        *//*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*//*
        *//*for (String i:list) {
            System.out.println(i);
        }*//*
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

    }*/
}
