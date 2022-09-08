package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-06-30  22:09
 * @Description: TODO
 * @Version: 1.0
 */

public class HJ72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int x,y,z;
            for (x = 0; x<= 14; x++){
                if ((100-7*x) %4 ==0){
                    y = (100-7*x)/4;
                    z = 100-x-y;
                    System.out.print(x +" ");
                    System.out.print(y +" ");
                    System.out.print(z +" ");
                    System.out.println();
                }
            }
        }
    }
}
