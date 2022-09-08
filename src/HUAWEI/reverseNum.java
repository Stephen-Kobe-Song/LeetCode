package HUAWEI;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-24  17:05
 * @Description: TODO
 * @Version: 1.0
 */

public class reverseNum {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            StringBuffer strb = new StringBuffer(str);
            strb.reverse();
            System.out.println(strb.toString());
        }


}
