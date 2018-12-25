package Base.ch2.Overloading;

import java.util.Random;

/**
 * this用法
 *      引用隐式参数
 *      调用该类其他的构造器
 */

public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry", 4000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for (Employee e : staff){
            System.out.println("name=" + e.getName() + ",id=" +
                    e.getId() + ",salary=" + e.getSalary());
        }
    }
}
class Employee{
    private static int nextID;

    private int id;
    private String name = "";//实例字段初始化
    private double salary;

    //静态初始化块
    static{
        Random generator = new Random();
        nextID = generator.nextInt(1000);
    }

    //object初始化块
    {
        id = nextID;
        nextID ++;
    }

    //默认构造方法
    public Employee(){

    }

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary){
        this("Employee #" + nextID, salary);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }

}