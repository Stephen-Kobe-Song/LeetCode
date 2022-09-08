package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-26  11:46
 * @Description: TODO
 * @Version: 1.0
 */

public class strAdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        for (int i = 2; i < n; i++) {
            if (isPerfert(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean  isPerfert(int num){
        int tmp=1;
        for (int i = 2; i <= num/2; i++) {
            if (num%i==0){
                tmp += i;
            }
        }
        if (tmp == num){
            return true;
        }

        return false;
    }
}
