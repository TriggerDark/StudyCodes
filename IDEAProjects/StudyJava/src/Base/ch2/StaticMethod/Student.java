package Base.ch2.StaticMethod;

/**
 * final修饰符修饰的对象不可改变
 * 类名.静态方法
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
    static String schoolName;
    private int number1 = 1;
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