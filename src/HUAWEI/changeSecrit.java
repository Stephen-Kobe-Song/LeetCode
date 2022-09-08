package HUAWEI;

import com.sun.applet2.AppletParameters;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-24  20:16
 * @Description: TODO
 * @Version: 1.0
 */

public class changeSecrit {

    static HashMap<String,String> map = new HashMap<>();
    static{
        map.put("1","1");
        map.put("abc","2");
        map.put("def","3");
        map.put("ghi","4");
        map.put("jkl","5");
        map.put("mno","6");
        map.put("pqrs","7");
        map.put("tuv","8");
        map.put("wxyz","9");
        map.put("0","0");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            char[] chars = str.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (char ch :chars){
                if (ch >= '0' && ch<='9'){
                    sb.append(String.valueOf(ch));
                }else if (ch >='A' && ch <='Y'){
                    char newChar = (char) (ch+32+1);
                    sb.append(String.valueOf(newChar));
                }else if (ch =='Z'){
                    sb.append("a");
                }else {
                    Set<String> keySet = map.keySet();
                    for (String k :keySet){
                        if (k.contains(String.valueOf(ch)))
                            sb.append(map.get(k));
                    }
                }
            }
            System.out.println(sb.toString());
        }

    }
}
