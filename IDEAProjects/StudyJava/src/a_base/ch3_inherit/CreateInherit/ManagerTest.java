package base.ch3.CreateInherit;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Justin", 80000, 1987, 12, 1);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("jihaitao", 2000, 1997, 5, 12);
        staff[2] = new Employee("XP", 2000, 1998, 12, 31);
        for (Employee e:staff){
            System.out.println("name=" + e.getName() + ",salary=" +
                    e.getSalary());
        }
    }
}
