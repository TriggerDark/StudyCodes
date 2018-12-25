package Base.ch3.CreateInherit;

/**
 * super用法：
 *      super指父类对象
 *      调用时必须放在构造方法的第一行
 *      不可调用私有属性和方法
 */

public class Teacher {

    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher("张三", "江苏科技大学", 38);
        jt.teaching();
    }

}
class teacherInfo{
    private String name;
    private String school;

    public teacherInfo(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public void teaching() {
        System.out.println("老师正在授课");
    }
}

class JavaTeacher extends teacherInfo{

    private int age;

    public JavaTeacher(String name, String school, int age) {
        //调用父类的构造方法
        super(name, school);
        this.age = age;
    }

    //重写父类的方法
    public void teaching() {
        //调用父类方法
        super.teaching();
        System.out.println("age：" + age);
        System.out.println("上Java课");
    }
}