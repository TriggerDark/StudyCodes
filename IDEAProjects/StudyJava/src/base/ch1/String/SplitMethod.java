package Base.ch1.String;

/**
 * 和enum.values()用法相似
 */

public class SplitMethod {
    public static void main(String[] args){
        String greeting = "Justin Hello Justin hello";
        String[] str = greeting.split(" ");
        for (String ele: str)
            System.out.println(ele);
    }
}
