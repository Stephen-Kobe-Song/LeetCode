package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-26  11:19
 * @Description: TODO
 * @Version: 1.0
 */

public class ListR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int num =in.nextInt();
            ListNode header = new ListNode();
            for (int i = 0; i < num; i++) {
                int val = in.nextInt();
                ListNode node = new ListNode(val, header.next);
                header.next = node;
            }
            int target = in.nextInt();
            for (int i = 0; i < target; i++) {
                header = header.next;
            }
            System.out.println(header.val);
        }
    }
}

class ListNode{
    int val;
    ListNode next;
    public ListNode(){

    }
    public ListNode(int val,ListNode next){
        this.val =val;
        this.next = next;
    }
}