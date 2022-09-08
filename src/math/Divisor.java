package math;

import java.util.Scanner;

public class Divisor {
    // 最大公约数 欧几里德算法（辗转相除法：用较大数除以较小数，再用出现的余数（第一余数）去除除数再用出现的余数（第二余数）去除第一余数，如此反复直到最后余数是0为止。）
    public static int gcd(int a,int b){

        return b==0?a :gcd(b,a%b);
    }
    // 最小公倍数：最小公倍数为两数的乘积除以最大公约数！
    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    /*
    使用位运算和减法求解最大公约数
    idea: 1、如果 a 和 b 均为偶数，f(a, b) = 2*f(a/2, b/2);
         2、如果 a 是偶数 b 是奇数，f(a, b) = f(a/2, b);
         3、如果 b 是偶数 a 是奇数，f(a, b) = f(a, b/2);
         4、如果 a 和 b 均为奇数，f(a, b) = f(b, a-b);
    Note：乘 2 和除 2 都可以转换为移位操作。
     */
    /*
        判断是否为偶数！
     */
    public static boolean isEven(int a){
        if (a%2==0)
            return true;
        return false;
    }
    // 算法核心思想还是欧几里德算法
    public static int gcd1(int a,int b){
        if (a < b) {
            return gcd(b, a);
        }
        if (b == 0) {
            return a;
        }
        boolean isAEven = isEven(a), isBEven = isEven(b);
        if (isAEven && isBEven) {
            return 2 * gcd(a >> 1, b >> 1);
        } else if (isAEven && !isBEven) {
            return gcd(a >> 1, b);
        } else if (!isAEven && isBEven) {
            return gcd(a, b >> 1);
        } else {
            return gcd(b, a - b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
        System.out.println(gcd1(a,b));
    }
}
