package HUAWEI;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-08-03  21:33
 * @Description: TODO
 * @Version: 1.0
 */

public class HJ87 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String passWord = in.nextLine();
            ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < passWord.length(); i++) {
                list.add(passWord.charAt(i));
            }
            int score = 0;
            // 判断长度
            if (list.size() <= 4) {
                score += 5;
            }
            if (list.size() >= 5 && list.size() <= 7) {
                score += 10;
            } else
                score += 25;
            // 判断字母
            ArrayList<Integer> listCha = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) >= 65 && list.get(i) <= 90) {
                    listCha.add(1);
                } else if (list.get(i) >= 97 && list.get(i) <= 122) {
                    listCha.add(2);
                }
            }
            if (listCha.contains(1) && listCha.contains(2)) {
                score += 20;
            }
            else if (listCha.contains(1) || listCha.contains(2))
                score += 10;
            // 判断数字
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) >= 48 && list.get(i) <= 57) {
                    count++;
                }
            }
            if (count == 1)
                score += 10;
            else if (count > 1)
                score += 20;
            // 判断符号
            int num = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) >= 32 && list.get(i) <= 47 || list.get(i) >= 58 && list.get(i) <= 64 || list.get(i) >= 91 && list.get(i) <= 96 || list.get(i) >= 123 && list.get(i) <= 126)
                    num++;
            }
            if (num == 1)
                score += 10;
            else if (num > 1)
                score += 25;

            // 奖励分
            if (listCha.contains(1) && listCha.contains(2) && count >= 1 && num >= 1)
                score += 5;
            if (listCha.contains(1) || listCha.contains(2) && count >= 1 && num >= 1)
                score += 3;
            if (listCha.contains(1) || listCha.contains(2) && count >= 1 && num < 1)
                score += 2;

            if (score >= 90)
                System.out.println("VERY_SECURE");
            else if (score >= 80)
                System.out.println("SECURE");
            else if (score >= 70)
                System.out.println("VERY_STRONG");
            else if (score >= 60)
                System.out.println("STRONG");
            else if (score >= 50)
                System.out.println("AVERAGE");
            else if (score >= 25)
                System.out.println("WEAK");
            else if (score >= 0)
                System.out.println("VERY_WEAK");

        }
    }
}
