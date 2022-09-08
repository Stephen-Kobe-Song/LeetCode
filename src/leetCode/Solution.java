package leetCode;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: LeetCode
 * @Author: song
 * @CreateTime: 2022-05-20  14:20
 * @Description: TODO
 * @Version: 1.0
 */

public class Solution {
    public static boolean rotateString(String s, String goal) {
        String tmp = s;
        String rs = null;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            tmp += ch;
            rs = tmp.substring(i+1,tmp.length());
            if (rs.equals(goal)){
                return true;
            }
            rs=null;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }
}
