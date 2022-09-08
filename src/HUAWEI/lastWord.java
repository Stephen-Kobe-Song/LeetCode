package HUAWEI;
import java.util.Scanner;
/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-24  15:05
 * @Description: TODO
 * @Version: 1.0
 */

public class lastWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] s = str.split(" ");
        System.out.println(s[s.length -1].length());
    }

}
