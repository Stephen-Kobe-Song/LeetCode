package HUAWEI;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-07-16  13:03
 * @Description: TODO
 * @Version: 1.0
 */

public class HJ81 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String shortStr = in.nextLine();
            String longStr = in.nextLine();
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < shortStr.length(); i++) {
                set.add(shortStr.charAt(i));
            }
            for (int i = 0; i < longStr.length(); i++) {
                set.remove(longStr.charAt(i));
            }
            System.out.println(set.size()==0);
        }
    }
}
