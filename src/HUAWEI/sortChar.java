package HUAWEI;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-25  16:45
 * @Description: TODO
 * @Version: 1.0
 */

public class sortChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] chars = line.toCharArray();
        Arrays.sort(chars);
        for (char c :chars)
            System.out.print(c);
        System.out.println();
    }
}
