package leetCode;

import java.util.HashMap;
import java.util.Set;
/*字符串统计字符的频次！*/
public class testStr {
    public static void main(String[] args) {
        String str = "7 1 6 4 2 2 5 3 4 3 4 5 1 6 7 ";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i =1; i< str.length();i++){
            char ch = str.charAt(i);
            if (map.containsKey(ch)){
                int count = map.get(ch);
                count = count + 1;
                map.put(ch,count);
            }else {
                map.put(ch ,1);
            }
        }

        Set<Character> key = map.keySet();
        for (Character ch : key){
            System.out.println("字符:" + ch +"出现的次数为 ：" + map.get(ch));
        }
    }

}
