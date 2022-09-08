package leetCode;


import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: leetCode
 * @Author: song
 * @CreateTime: 2022-08-05  19:39
 * @Description: TODO
 * @Version: 1.0
 */

public class tmp {
    public static void main(String[] args) {
        String string = null;
        int count = 0;
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("e") || words[i].contains("E")){
                count++;
            }
        }

    }
    public class Point {
   int x;
   int y;
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
    public long getArea (Point p1, Point p2, Point p3, Point p4) {
        // write code here
        long h = p3.y - p1.y;
        if (h < 0){
            h = -h;
        }
        long s = p2.x * h;
        long s1 =( p1.x - p4.x) * (p4.y-p1.y);
        if (s1<0)
            s1 = -s1;
        long s2 = (p3.y - p4.y) * (p3.x - p4.x);
        if (s2 < 0)
            s2 = -s2;
        long s3;
        return s;
    }

}