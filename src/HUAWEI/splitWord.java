package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-24  15:36
 * @Description: TODO
 * @Version: 1.0
 */

public class splitWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            int size = str.length();
            int addZero = 8-size%8;
            while (addZero > 0 && (addZero <8)) {
                sb.append("0");
                addZero--;
            }
            String tmp = sb.toString();
            while (tmp.length() > 0){
                System.out.println(tmp.substring(0,8));
                tmp = tmp.substring(8);
            }
        }
    }
}
