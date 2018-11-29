package Base.ch2;

import java.time.LocalDate;

/**
 * 构造Employee类
 */

class Employee {
    //属性
    private String name;
    private double salary;
    private LocalDate hireDay;

    //构造方法
    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    //方法1
    public String getName(){
        return name;
    }

    //方法2
    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

}
