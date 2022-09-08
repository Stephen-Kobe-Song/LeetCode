package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-24  16:19
 * @Description: TODO
 * @Version: 1.0
 */

public class zhishu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = Long.parseLong(sc.next());
        getPrimer(num);
    }

    private static void getPrimer(long num) {
        for (int i = 2; i <=num ; i++) {
            if (num%i == 0){
                System.out.println(i +" ");
                getPrimer(num/i);
                break;
            }
            if (i==num){
                System.out.println(i + " ");
            }
        }
    }
}
