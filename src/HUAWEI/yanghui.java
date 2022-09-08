package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-26  11:44
 * @Description: TODO
 * @Version: 1.0
 */

public class yanghui {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n==1 || n==2){
                System.out.println(-1);
            }
            else if(n%4==3 || n%4==1){
                System.out.println(2);
            }
            else if(n%4==0){
                System.out.println(3);
            }
            else if(n%4==2){
                System.out.println(4);
            }
        }
    }
}
