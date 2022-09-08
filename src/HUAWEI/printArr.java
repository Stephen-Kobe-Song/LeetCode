package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-25  16:54
 * @Description: TODO
 * @Version: 1.0
 */

public class printArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int i = 1; i<= n; i++){
                for(int j=0; j<=n-i; j++){
                    System.out.print((i+j)*(i+j+1)/2-(i-1));
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
