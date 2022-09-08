package HUAWEI;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-24  19:21
 * @Description: TODO
 * @Version: 1.0
 */

public class sortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = null;
        while(sc.hasNext()){
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                str[i] = sc.next();
            }
        }
        Arrays.sort(str);
        for (String s: str){
            System.out.println(s);
        }

    }
}
