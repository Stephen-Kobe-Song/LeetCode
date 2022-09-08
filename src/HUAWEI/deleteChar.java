package HUAWEI;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-25  15:11
 * @Description: TODO
 * @Version: 1.0
 */

public class deleteChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int min = Integer.MAX_VALUE;
        for(int times: map.values()){
            min = Math.min(min,times);
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> e : entries){
            System.out.println(e.getKey() +" " + e.getValue());
        }
        StringBuilder builder = new StringBuilder();
        for (Character c : str.toCharArray()){
            if (map.get(c) != min){
                builder.append(c);
            }
        }
        System.out.println(builder.toString());

    }
}
