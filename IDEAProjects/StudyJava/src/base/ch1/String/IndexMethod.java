package base.ch1.String;

/**
 * indexOf()--->从左往右
 * lastindexOf()-->从右往左
 */

public class IndexMethod {
    public static void main(String[] args){
        String greeting = "Justin Hello Justin hello";
        String index = "Justin";

        System.out.println(greeting.indexOf(index, 2));
        System.out.println(greeting.indexOf(index + "1", 2));

        System.out.println(greeting.lastIndexOf(index));
    }
}
