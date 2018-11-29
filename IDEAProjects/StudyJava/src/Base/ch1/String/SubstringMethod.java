package Base.ch1.String;

/**
 * str.SubstringMethod([start,] end)--->子串，相当于切片start可以不定义
 */


public class SubstringMethod {
    public static void main(String[] args){
        String greeting = "HELLO";
        System.out.println(greeting.substring(4));
        System.out.println(greeting.substring(1, 3));
    }
}
