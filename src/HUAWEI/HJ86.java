package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-08-03  21:16
 * @Description: TODO
 * @Version: 1.0
 */

public class HJ86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            String s = Integer.toBinaryString(num);
            String[] split = s.split("0");
            int result = 0;
            for (int i = 0; i < split.length; i++) {
                if (split[i].length() >result){
                    result =split[i].length();
                }
            }
            System.out.println(result);
        }
    }
}
