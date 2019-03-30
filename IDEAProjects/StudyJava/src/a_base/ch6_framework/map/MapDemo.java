package base.ch6.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("CN", "中华人民共和国");
        countries.put("RU", "俄罗斯联邦");
        countries.put("FR", "法兰西共和国");
        countries.put("US", "美利坚合众国");

        //获取map的元素组数
        System.out.println(countries.size());
        //获取某个键的值
        System.out.println(countries.get("CN"));
        //判断map中是否包含某个键
        System.out.println(countries.containsKey("US"));
        //删除特定键对应的键值对
        countries.remove("US");
        System.out.println(countries.size());

        //分别显示map中键集、值集、和键值对集
        System.out.println(countries.keySet());
        System.out.println(countries.values());
        System.out.println(countries);

        //countries.clear();
        if (countries.isEmpty()) {
            System.out.println("Map数据已经清空");
        }
        System.out.println("******************");
        //方法一
        Set<String> keys = countries.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = countries.get(key);
            System.out.println(key + "-" + value);
        }
        System.out.println("******************");
        //方法二
        for (Map.Entry<String, String> me:countries.entrySet()){
            System.out.println(me.getKey() + "-" + me.getValue());
        }
    }
}
