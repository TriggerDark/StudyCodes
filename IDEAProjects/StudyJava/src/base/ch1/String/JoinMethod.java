package base.ch1.String;

/**
 * 字符串的拼接
 *      +： str1 + str2 -->str1 和 str2可以一个为数字，一个为字符
 *      String.join("", str1, str2...)-->第一个参数为结合的str1与str2之间间隔的形式
 */

public class JoinMethod {
    public static void main(String[] args){
        String greeting1 = "HELLO";
        String greeting2 = "WORLD";

        System.out.println(greeting1 + ", " + greeting2);
        System.out.println(String.join(", ", greeting1, greeting2));
    }
}
