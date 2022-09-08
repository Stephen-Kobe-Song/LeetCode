package math;

import java.util.Scanner;

/*
    给定整数n，返回所有小于非负整数n的质数的数量；
    example：n=10;
    output:4
    explain:小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
    idea：非质数可以被分解为质数的乘积，但是质数不可以被分解为数的乘积！
 */
public class Primes {
    public static int countPrimes(int n){
        // 记录不是质数的布尔数组
        boolean[] notPrimes = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrimes[i]){
                continue;
            }
            count++;
            // 从 i * i 开始，因为如果 k < i，那么 k * i 在之前就已经被去除过了;
            // Note：相乘过的质数来上自己本身的数，还是非质数！
            for (long j = (long)(i) *i; j<n; j += i ){
                notPrimes[(int) j] = true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countPrimes(n));
    }
}

