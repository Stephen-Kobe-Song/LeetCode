package HUAWEI;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-24  16:33
 * @Description: TODO
 * @Version: 1.0
 */

public class mergeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(sc.hasNext()){
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                map.put(a, map.getOrDefault(a,0)+b);
            }

        }
        for (Integer i : map.keySet()){
            System.out.println(i + " " + map.get(i));
        }

    }
}
