package leetCode;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: leetCode
 * @Author: song
 * @CreateTime: 2022-05-21  15:08
 * @Description: TODO
 * @Version: 1.0
 */

public class tmpClass {
    public static  int isPrefixOfWord() {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        String[] str = null;
        str = sentence.split(" ");
        String tmp=null;
        int length = searchWord.length();
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < length){
                continue;
            }
            if (str[i].length() >= length){
                tmp = str[i].substring(0,length);
                if (tmp.equals(searchWord)){
                    return i+1;
                }
            }

        }
        return -1;
    }

    public static int maxRepeating() {
        String sequence = "ababc";
        String word = "ab";
        int count = 0;
        StringBuilder sb = new StringBuilder(word);
        while(sequence.contains(sb)) {
            count++; sb.append(word);
        }
        return count;
    }

    public static void main(String[] args) {
//        System.out.println(isPrefixOfWord());
        System.out.println(maxRepeating());
    }

}
