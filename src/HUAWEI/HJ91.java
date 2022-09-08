package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-08-03  22:05
 * @Description: 基本动态规划
 * @Version: 1.0
 */

public class HJ91 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] dp = new int[n + 1][m + 1];
            for (int i = 0; i <= n; ++i) {
                for (int j= 0;  j<= m; ++j) {
                    if (i == 0 || j ==0)
                        dp[i][j] = 1;
                    else
                        dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
            System.out.println(dp[n][m]);
        }
    }
}
