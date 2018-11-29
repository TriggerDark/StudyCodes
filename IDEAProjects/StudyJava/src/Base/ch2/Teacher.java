package Base.ch2;

public class Teacher {

    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher("张三", "江苏科技大学", 38);
        jt.teaching();
    }

}
class teacherInfor{
    private String name;
    private String school;

    public teacherInfor(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public void teaching() {
        System.out.println("老师正在授课");
    }
}

class JavaTeacher extends teacherInfor{
    private int age;

    public JavaTeacher(String name, String school, int age) {
        super(name, school);//调用父类的构造方法
        this.age = age;
    }

    public void teaching() {//重写父类的方法
        System.out.println("age：" + age);
        System.out.println("上Java课");
    }
}