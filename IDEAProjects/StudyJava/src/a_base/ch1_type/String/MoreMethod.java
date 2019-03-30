package base.ch1.String;

/***
 * charAt(int index)返回一个char类型
 */
public class MoreMethod {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting.charAt(1));
        System.out.println(greeting.compareTo("H"));

        StringBuilder sb = new StringBuilder();
        sb.append('a');
        sb.append("bcd");
        String sbstring = sb.toString();
        System.out.print(sbstring);
    }
}
