package leetCode;

import java.util.Scanner;

public class  testReader{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = null;
        String  order = null;
        String tempString = in.nextLine();
        words = tempString.split(" ");
        order = in.nextLine();
        System.out.println(isAlienSorted(words, order));

    }
    public static boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        // 给每个字母符号附上一个数值，表示该字母的顺序
        for (int i = 0; i < index.length; ++i) {
            index[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
            boolean val = false;
            for (int j = 0;j< words[i-1].length() && j< words[i].length();j++){
                int pre = index[words[i-1].charAt(j) - 'a'];
                int curr = index[words[i].charAt(j) - 'a'];
                if (pre < curr){
                    val =true;
                    break;
                }else if (pre > curr){
                    return false;
                }
            }
            if (!val){
                if (words[i-1].length() > words[i].length()){
                    return false;
                }
            }

        }
        return true;
    }
}