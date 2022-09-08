package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-07-02  22:38
 * @Description: 输入一个日期，计算这一天是在当年的第几天；
 * @Version: 1.0
 */

public class HJ73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String time = in.nextLine();
            String[] s = time.split(" ");
            int[] arr = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int[] mouthDay = {31,28,31,30,31,30,31,31,30,31,30,31};
            if (checkYear(arr[0])){
                mouthDay[1] = 29;
            }
            int count = 0;
            for (int i = 0; i < arr[1]-1; i++) {
                count = mouthDay[i] +count;
            }
            count = count + arr[2];
            System.out.println(count);
        }
    }
    public static boolean checkYear(int year){
        if (year%400 == 0 ){
            return true;
        }
        if (year%4 == 0 && year % 100 != 0){
            return true;
        }

        return false;
    }
}
