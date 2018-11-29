package Base.ch1.InputAndOutput;


import java.util.Date;

/**
 * %s, %c: 字符串，字符
 * %o, %d, %x: 八进制，十进制，十六进制
 * %f, %e, %g, %a: 定点浮点数，指数浮点数，通用浮点数，十六进制浮点数
 * %b: 布尔
 * %%: 百分号
 * %n: 行分隔符
 * %h: 散列码
 */

public class Printf {
    public static void main(String[] args) {
        double x = 1000/3.0;
        System.out.println(x);
        System.out.printf("%8.2f\n", x);
        System.out.printf("%tc\n", new Date());
    }
}
