package Base.ch1.String;

/**
 * s.equals(t) -->s与t是否相等
 * s.equalsIgnoreCase(t) -->忽略大小写判断字符串相等
 * ==
 */

public class EqualsMethod {
    public static void main(String[] args){
        String greeting1 = "HELLO";
        String greeting2 = "HELLO";
        String greeting3 = "Hello";

        System.out.println(greeting1.equals(greeting2));
        System.out.println(greeting1.equalsIgnoreCase(greeting3));

        System.out.println(greeting1 == greeting2);
        System.out.println(greeting1 == greeting3);

    }
}
