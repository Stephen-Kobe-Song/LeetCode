package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-24  19:16
 * @Description: TODO
 * @Version: 1.0
 */

public class reverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        for (int i = s.length-1; i >=0; i--) {
            System.out.print(s[i] + " ");
        }
    }
}
