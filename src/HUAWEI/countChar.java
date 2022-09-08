package HUAWEI;

import java.util.Locale;
import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-24  15:25
 * @Description: TODO
 * @Version: 1.0
 */

public class countChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().toLowerCase();
        String ch = in.nextLine().toLowerCase();
        System.out.println(str.length() - str.replaceAll(ch,"").length());
    }
}
