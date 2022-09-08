package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-07-02  23:11
 * @Description: 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
 * @Version: 1.0
 */

public class HJ76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int m = in.nextInt();
            // 找规律，经观察：第一项为n(n-1)+1，最后一项为n(n+1)-1，把中间的数print一下就ok
            int start = m*(m-1) +1;
            int end = m*(m+1) -1;
            for (int i = start; i <=end ; i+=2) {
                if (i == end){
                    System.out.print(i);
                }
                else {
                    System.out.print(i + "+");
                }
            }
        }
    }
}
