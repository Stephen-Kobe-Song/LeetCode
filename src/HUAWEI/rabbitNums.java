package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-25  17:04
 * @Description: TODO
 * @Version: 1.0
 */

public class rabbitNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println(f(month));
    }
    public static int f(int n){
        if (n==1||n==2)
            return 1;
        return f(n-1) +f(n-2);
    }
}
