package Base.ch2.CreateClass;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * ArrayList<>()
 * add([index,] x)-->增加
 * size()--->大小
 * ensureCapacity()
 * trimToSize()
 * set(index, x)--->覆盖
 * get()
 * remove(index)--->删除索引位置的元素
 */

public class ArrayListTest {
    public static void main(String[] args) {
        //new ArrayList<>()构造一个为空数组列表
        ArrayList<Employee> staff = new ArrayList<>();
        //new ArrayList<>()用指定容量构造一个为空数组列表
        //ArrayList<Employee> staff = new ArrayList<>(3);
        //add()增加元素到列表的末尾
        staff.add(new Employee("Jihaitao", 1000, 1997, 5, 12));
        staff.add(new Employee("lidada", 2000, 1997, 4, 28));
        staff.add(new Employee("name", 3000, 2018, 11, 29));

        //指定索引进行替换
        //staff.set(2, new Employee("name1", 4000, 2018, 12, 7));
        //向后移动元素，以便插入元素
        staff.add(1, new Employee("name1", 4000, 2018, 12, 7));
        //与上面add()相反
        staff.remove(1);
        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e:staff){
            //System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
        //size()返回当前数组列表的元素数量
        //System.out.println(staff.size());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        System.out.println(list);
        int n = list.get(0);
        System.out.println(n);

        int x = Integer.parseInt("111");
        System.out.println(x);
        System.out.println(Integer.toString(x));
    }
}
