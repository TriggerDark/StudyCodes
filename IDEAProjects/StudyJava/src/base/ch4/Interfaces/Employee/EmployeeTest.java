package base.ch4.Interfaces.Employee;

import java.util.Arrays;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker", 3500);
        staff[1] = new Employee("Carl Cracker", 7500);
        staff[2] = new Employee("Tony Tester", 3800);

        Arrays.sort(staff);
        for (Employee e:staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}
