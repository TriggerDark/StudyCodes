package Base.ch3.Polymorphism;

import java.util.Scanner;

public class Printer {
    /*多态;
     * 多态要依托于继承关系
     * 父类类型的对象可以调用子类对象的引用
     */
    public static void main(String[] args) {
        ColorPrinter cp = new ColorPrinter("惠普");
        BlackPrinter bp = new BlackPrinter("联想");
        School.print(cp,"欢迎来到王者荣耀");
        School.print(bp, "欢迎来到王者荣耀");
    }
}