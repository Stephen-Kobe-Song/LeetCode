package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-26  22:21
 * @Description: TODO
 * @Version: 1.0
 */

public class HJ60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int min = Integer.MAX_VALUE;
        int[] arr= new int[2];
        for (int i = 1; i <= num/2; i++) {
            if (isPrime(i) && isPrime(num-i)){
                int tmp = num-2*i;
                if (tmp< min){
                    min=tmp;
                    arr[0] = i;
                    arr[1] =num-i;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



    public static boolean isPrime(int n){
        for (int i = 2; i < n/2; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
