package math;
/*
    进制转换
 */
public class ConvertToBase7 {
    // this method is equals Integer.toString(num, radix=7);
    public static String ConvertToBase7(int num){
        if (num==0)
            return "0";
        StringBuilder sb =new StringBuilder();
        boolean isNagetive = num < 0;
        if (isNagetive)
            num = -num;
        while(num >0){
            sb.append(num%7);
            num/=7;
        }
        String ret = sb.reverse().toString();
        return isNagetive?"-" + ret : ret;

    }
    // Java 中 static String toString(int num, int radix) 可以将一个整数转换为 radix 进制表示的字符串。
    public static String convertToBase7(int num){
        return Integer.toString(num,16);
    }
    // 26进制
    public static String convertToBase26(int num){
        if (num ==0)
            return "";
        num--;
        return convertToBase26(num/26) + (char)(num%26 + 'A');
    }
    public static void main(String[] args) {
        int n=109;
        System.out.println(convertToBase26(n));
    }
}
