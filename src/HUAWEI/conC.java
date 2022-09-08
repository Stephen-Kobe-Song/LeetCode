package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-26  01:13
 * @Description: TODO
 * @Version: 1.0
 */

public class conC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            int letters = 0;
            int spaces = 0;
            int digtis = 0;
            int others = 0;
            int len = s.length();
            for (int i = 0; i < len; i++) {
                char ch = s.charAt(i);
                if (Character.isLetter(ch)){
                    letters++;
                }else if (Character.isDigit(ch)){
                    digtis++;
                }else if (Character.isSpaceChar(ch)){
                    spaces++;
                }else
                    others++;
            }
            System.out.println(letters);
            System.out.println(spaces);
            System.out.println(digtis);
            System.out.println(others);
        }

    }
}
