package base.ch3.CreateInherit;

/**
 * 继承：不能继承父类的private成员
 *      不能继承父类的构造方法
 *      子类与父类不在同一个包下，不能继承使用默认访问权限的成员
 *
 * 继承条件下的构造方法：
 *      子类构造方法没有通过super显示调用父类的有参构造方法，也没有通过
 *    this显示调用自身其他构造方法···系统会默认调用父类的无参构造方法
 */

//创建Employee类的子类，即Manager类继承Employee类
public class Manager extends Employee {

    public double bonus;

    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    //override覆盖方法
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

}
