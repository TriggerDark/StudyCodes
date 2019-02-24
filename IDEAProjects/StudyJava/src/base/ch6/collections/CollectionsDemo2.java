package base.ch6.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students(1, "张三", "男"));
        list.add(new Students(2, "jack", "男"));
        list.add(new Students(5, "小花", "女"));
        list.add(new Students(8, "小兰", "女"));

        Collections.reverse(list);
        for (Students stu:list) {
            System.out.println(stu.getNumber() + "-" +
                    stu.getName() + "-" + stu.getSex());
        }
    }
}
