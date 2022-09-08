package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-07-19  09:43
 * @Description: TODO
 * @Version: 1.0
 */

public class HJ84 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str =in.nextLine();
            char[] chars = str.toCharArray();
            int count =0;
            for (char aChar : chars) {
                if (aChar >='A' && aChar <='Z')
                    count++;
            }
            System.out.println(count);
            // System.out.println(str.replaceAll("[^A-Z]","").length());
        }
    }
}
