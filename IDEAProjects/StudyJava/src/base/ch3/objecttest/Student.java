package Base.ch3.ObjectTest;

public class Student {
    private int sid;
    private String name;
    private int age;
    private int weight;

    public Student(){}
    public Student(int sid, String name, int age, int weight){
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getSid(){
        return sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    //重写equals()
    @Override
    public boolean equals(Object obj) {
        //检测this和obj是否引用同一个对象
        if (this == obj) {
            return true;
        }

        //检测obj是否是null
        if (obj == null) {
            return false;
        }

        //检测是否来自同一个类
        //instanceof操作符，判断某个对象是否属于某一种类型
        if (!(obj instanceof Student)) {
            return false;
        }
        /*if (this.getClass() != obj.getClass()){
            return false;
        }*/

        //将obj转换为相应的类类型变量
        Student s = (Student)obj;

        //==判断基本类型域，使用equals()比较对象域
        if (this.sid == s.sid && this.name.equals(s.name)) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "张三", 18, 50);
        Student s2 = new Student(1, "张三", 18, 50);
        //Student s2 = s1;
        //默认情况下，==的作用和equals()的作用是一样的，都是比较两个对象是否是同一个
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        //toString()
        System.out.println(s1.toString());
    }
    
}