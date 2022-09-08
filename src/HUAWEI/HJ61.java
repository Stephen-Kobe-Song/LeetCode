package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-06-02  18:39
 * @Description: TODO
 * @Version: 1.0
 */

public class HJ61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] s = line.split(" ");
        int M =Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);
        System.out.println(count(M,N));
    }
    public static int count(int m ,int n){
        // 当没有苹果或者只有一个盘子的时候，就只有一种摆放方法！
        if (m == 0 || n == 1){
            return 1;
        }
        // 当盘子数大于苹果数，一定有n-m个盘子空着，而且每个盘子都一样，因此count(m,n)==count(m,n-1)
        if(n > m){
            return count(m,n-1);
        }else {
            // 当盘子数<=苹果数，有两种情况：
            // 1.至少有一个盘子可以不放，因此count(m, n-1)
            // 2.至少每个盘子都有一个苹果，摆放后苹果数为(m-n)，因此count(m-n, n)
            return count(m,n-1) + count(m-n,n);
        }
    }

}
