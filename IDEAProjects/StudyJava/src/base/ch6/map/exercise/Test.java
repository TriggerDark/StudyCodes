package base.ch6.map.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        //key-value: 英文名-学员信息
        students.put("Jack", new Student("张三", "男"));
        students.put("Tom", new Student("李四", "男"));
        students.put("Kitty", new Student("王五", "男"));

        //根据特定的key获取响应的value
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要查找的学员英文名字信息：");
        String key = input.next();
        if (students.containsKey(key)) {
            Student student = students.get(key);
            System.out.println(student.getName() + "-" + student.getSex());
        } else {
            System.out.println("不存在");
        }
    }
}
