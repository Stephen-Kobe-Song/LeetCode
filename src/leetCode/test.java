package leetCode;

import java.util.HashMap;

public class test {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(){
            {
                put('I',1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };
        int num = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int value = map.get(s.charAt(i));
            if (i < s.length() - 1 && value < map.get(s.charAt(i + 1))){
                num -= value;
            }else
            {
                num += value;
            }

        }
        return num;

    }
}
