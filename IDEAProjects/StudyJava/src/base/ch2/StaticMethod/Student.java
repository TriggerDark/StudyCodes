package Base.ch2.StaticMethod;

/**
 * final修饰符修饰的对象不可改变
 *
 * 类名.静态变量(类变量)
 * 类名.静态方法
 * 静态代码块：只要构造类的对象，块就会被执行
 *
 * 静态方法不能使用this和super
 *      不能直接访问所属类的实例变量和实例方法
 *      可直接访问类的静态变量和静态方法
 *
 * 在方法中不能定义静态变量
 *
 */

public class Student {

    public static void main(String[] args) {
        studentInfo stu1 = new studentInfo();
        studentInfo stu2 = new studentInfo();
        studentInfo.schoolName = "江苏科技大学";

        System.out.println(stu1.schoolName);
        System.out.println(stu2.schoolName);

        stu1.showNumber1();
        studentInfo.showNumber2();
    }

}
class studentInfo{
    static String schoolName;//静态变量
    private int number1 = 1;//实例变量
    private static int number2 = 2;

    public studentInfo() {
        System.out.println("构造方法");
    }

    static { System.out.println("静态语句块"); }

    public void showNumber1(){
        System.out.println(number1);
    }

    public static void showNumber2() {
        System.out.println(number2);
    }

    public String toString() {
        return schoolName;
    }
}