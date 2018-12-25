package base.ch1.String;

/**
 * startsWith
 * endsWith
 *  返回true和false
 */

public class EndStartwithMethod {
    public static void main(String[] args){
        String greeting = "data.txt";

        System.out.println(greeting.startsWith("data"));
        System.out.println(greeting.endsWith(".txt"));
    }
}
