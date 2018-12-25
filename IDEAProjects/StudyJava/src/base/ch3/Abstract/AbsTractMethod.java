package Base.ch3.Abstract;

/**
 * 抽象方法没有方法体
 * 包含抽象方法的类一定是抽象类
 * 抽象类不能实例化
 * 没有抽象构造方法，也没有抽象静态方法
 * 抽象类可以有非抽象的走早方法，创建子类的实例时可能调用
 * 抽象类的子类可以是普通类，该普通类要实现抽象类中的抽象方法
 * 抽象类的子类可以是抽象类，父类的抽象方法可以在子类中不被实现
 */

public class AbsTractMethod {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("JiHT", 50000, 1989, 10, 1);
        people[1] = new Student("XP", "student");

        for (Person p: people){
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}

