package leetCode;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: LeetCode
 * @Author: song
 * @CreateTime: 2022-05-19  16:20
 * @Description: TODO
 * @Version: 1.0
 */

public class palindrome {
    public  boolean isPalindrome(String s){
        int length = s.length();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                buffer.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer reverse = new StringBuffer(buffer).reverse();
        return buffer.toString().equals(reverse.toString());
    }
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int cur = 0;
        int num = x;
        while (num !=0){
            cur = cur *10 + num %10;
            num = num/10;
        }
        return  cur==x;
    }

}


class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        palindrome palindrome = new palindrome();
        System.out.println(palindrome.isPalindrome(s));
    }
}