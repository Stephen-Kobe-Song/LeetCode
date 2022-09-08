package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-24  15:55
 * @Description: 十六进制
 * @Version: 1.0
 */

public class changeJinzhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String tmp = str.substring(2);
            Integer nums = Integer.valueOf(tmp,16);
            System.out.println(nums.toString());
        }

    }
}
