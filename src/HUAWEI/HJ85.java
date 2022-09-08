package HUAWEI;
import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-07-19  09:55
 * @Description: TODO
 * @Version: 1.0
 */

public class HJ85 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            int max =0;
            for (int i = 0; i < str.length(); i++) {
                for (int j = str.length(); j > i; j--) {
                    String substring = str.substring(i, j);
                    if (isTrue(substring)){
                        max = Math.max(max,j-i);
                    }
                }
            }
            System.out.println(max);
            return;
        }
    }
    static boolean isTrue(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
