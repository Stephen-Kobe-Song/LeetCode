package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-25  15:49
 * @Description: TODO
 * @Version: 1.0
 */

public class StringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])){
                buffer.append(chars[i]);
            }else {
                buffer.append(" ");
            }
        }
        String[] s = buffer.toString().split(" ");
        for (int i = s.length-1; i >=0 ; i--) {
            System.out.print(s[i]);
        }
    }
}
