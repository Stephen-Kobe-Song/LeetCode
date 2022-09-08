package HUAWEI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-07-07  21:43
 * @Description: TODO
 * @Version: 1.0
 */

public class HJ80 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            HashSet<Integer> set = new HashSet<>();
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                set.add(in.nextInt());
            }
            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                set.add(in.nextInt());
            }
            int[] arr = new int[set.size()];
            int index = 0;
            for (Integer i : set){
                arr[index++] = i;
            }
            Arrays.sort(arr);
            for (int i : arr){
                System.out.print(i);
            }
        }
    }
}
