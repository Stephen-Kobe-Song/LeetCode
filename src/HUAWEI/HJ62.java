package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-06-30  21:49
 * @Description: TODO
 * @Version: 1.0
 */

public class HJ62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            String numString = Integer.toBinaryString(num);
            int count= 0;
            for (int i = 0; i < numString.length(); i++) {
                if ('1' == numString.charAt(i))
                    count++;
            }
            System.out.println(count);
        }

    }
}
