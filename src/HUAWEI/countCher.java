package HUAWEI;


import java.util.HashSet;
import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-24  16:55
 * @Description: TODO
 * @Version: 1.0
 */

public class countCher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println(set.size());
    }
}
