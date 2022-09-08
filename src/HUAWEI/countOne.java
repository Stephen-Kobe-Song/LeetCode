package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-24  20:09
 * @Description: TODO
 * @Version: 1.0
 */

public class countOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int n =0;
        String s = Integer.toString(num, 2);
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch == '1'){
                n++;
            }
        }
        System.out.println(n);
    }
}
