package base.ch6.list.arraylist;

import java.util.ArrayList;
/**
 * ArrayList<>()
 * add([index,] x)-->增加
 * size()--->大小
 * contains(Object o) --> 判断列表中是否存在指定元素
 * ensureCapacity()
 * trimToSize()
 * set(index, x)--->覆盖
 * get()
 * remove(index)--->删除索引位置的元素
 *
 * 插入效率低
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        NewsTitle title1 = new NewsTitle(1, "天气不错1", "admin");
        NewsTitle title2 = new NewsTitle(2, "天气不错2", "admin");
        NewsTitle title3 = new NewsTitle(3, "天气不错3", "admin");
        NewsTitle title4 = new NewsTitle(4, "天气不错4", "admin");
        NewsTitle title5 = new NewsTitle(5, "天气不错5", "admin");

        ArrayList<NewsTitle> list = new ArrayList<>();
        //add()增加
        list.add(title1);
        list.add(title2);
        list.add(title3);
        list.add(title4);
        list.add(1, title5);

        System.out.println("新闻标题的总数为：" + list.size());
        for (int i=0; i < list.size(); i++) {
            System.out.println(list.get(i).getTitle());
        }
        System.out.println("*******");
        System.out.println(list.contains(title1));
        list.remove(title1);
        System.out.println(list.contains(title1));
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
