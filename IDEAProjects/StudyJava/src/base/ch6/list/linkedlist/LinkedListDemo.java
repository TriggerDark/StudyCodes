package base.ch6.list.linkedlist;

import base.ch6.list.arraylist.NewsTitle;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        NewsTitle title1 = new NewsTitle(1, "天气不错1", "admin1");
        NewsTitle title2 = new NewsTitle(2, "天气不错2", "admin2");
        NewsTitle title3 = new NewsTitle(3, "天气不错3", "admin3");
        NewsTitle title4 = new NewsTitle(4, "天气不错4", "admin4");
        NewsTitle title5 = new NewsTitle(5, "天气不错5", "admin5");
        NewsTitle title6 = new NewsTitle(6, "天气不错6", "admin6");
        NewsTitle title7 = new NewsTitle(7, "天气不错7", "admin7");

        LinkedList<NewsTitle> list = new LinkedList<>();
        list.add(title1);
        list.add(title2);
        list.add(title3);
        list.add(1, title4);
        list.addFirst(title5);
        list.addLast(title6);
        list.add(title7);

        for (NewsTitle newsTitle:list){
            System.out.println(newsTitle.getId() + "-"
                    + newsTitle.getTitle());
        }
        System.out.println("******");
        list.removeFirst();
        list.removeLast();
        for (NewsTitle newsTitle:list){
            System.out.println(newsTitle.getId() + "-"
                    + newsTitle.getTitle());
        }
        System.out.println(list.getFirst().getTitle());
        System.out.println(list.getLast().getTitle());
    }
}
