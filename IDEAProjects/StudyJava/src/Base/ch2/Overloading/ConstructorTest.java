package Base.ch2.Overloading;

import java.util.Random;

public class ConstructorTest {
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