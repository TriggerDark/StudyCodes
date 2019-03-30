package base.ch5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception  异常层次结构的父类
 * ArithmeticException  算数错误情形
 * InputMismatchException 输入格式错误
 * ArrayIndexOutOfBoundsException  下标越界
 * NullPointerException  尝试访问null对象成员
 * ClassNotFoundException  不能加载所需的类
 * IllegalArgumentException  非法参数
 * ClassCastException  对象强制类型转换出错
 * NumberFormatException  数字格式转化异常
 *
 *
 * 多个catch
 *      先子类后父类
 */

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数：");
        try {
            int num1 = in.nextInt();
            System.out.print("请输入除数：");
            int num2 = in.nextInt();
            System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("数字异常");
            //输出异常堆栈信息
            //e.printStackTrace();
            //打印异常字符串信息提示
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.exit(1);//非零的状态码表示异常终止
        } catch (Exception e) {
            e.printStackTrace();
        } finally {//发不发生异常都会运行(System.exit(0)除外)
            System.out.println("end");
        }
    }
}
