package base.ch6.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("four");
        list.add("five");
        list.add("six");

        String strMax = Collections.max(list);
        String strMin = Collections.min(list);
        System.out.println(strMax + "-" + strMin);

        //升序排序
        Collections.sort(list);
        for (String str:list) {
            System.out.println(str);
        }

        //查找
        System.out.println(Collections.binarySearch(list,"five"));

        //倒序
        Collections.reverse(list);
        for (String str:list) {
            System.out.println(str);
        }

    }
}
