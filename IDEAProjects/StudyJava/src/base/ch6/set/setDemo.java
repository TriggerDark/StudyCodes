package base.ch6.set;

import base.ch6.list.arraylist.NewsTitle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setDemo {
    public static void main(String[] args) {
        Set<NewsTitle> set = new HashSet<>();
        NewsTitle newsTitle1 = new NewsTitle(1, "hello1", "admin1");
        NewsTitle newsTitle2 = new NewsTitle(2, "hello2", "admin2");
        NewsTitle newsTitle3 = new NewsTitle(3, "hello3", "admin3");
        NewsTitle newsTitle4 = new NewsTitle(4, "hello4", "admin4");
        NewsTitle newsTitle5 = new NewsTitle(5, "hello5", "admin5");

        set.add(newsTitle1);
        set.add(newsTitle2);
        set.add(newsTitle3);
        set.add(newsTitle4);
        set.add(newsTitle5);

        for (NewsTitle newsTitle:set){
            System.out.println(newsTitle.getId() + "-"
                    + newsTitle.getTitle());
        }

        System.out.println("*******");

        Iterator<NewsTitle> iterator = set.iterator();
        while (iterator.hasNext()) {
            NewsTitle title = iterator.next();
            System.out.println(title.getId() + "-"
                    + title.getTitle());
        }
    }
}
