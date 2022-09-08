package HUAWEI;

import java.util.Scanner;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: HUAWEI
 * @Author: song
 * @CreateTime: 2022-05-25  15:03
 * @Description: TODO
 * @Version: 1.0
 */
/* 三个瓶子换回来一个，相当于两个瓶子换一批；
* 如果是两个瓶子，借一个在还一个，也相当于是两个瓶子换一个！
* 所以最终答案是两个瓶子换一个汽水！*/
public class changeBottle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if (n == 0)
                break;
            System.out.println(n/2);
        }
    }
}
