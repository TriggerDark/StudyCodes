package base.ch1.DataType;

import java.lang.*;

public class DataType {
    public static final double PI = 3.14;
    public static void main(String[] args){
        int num = 100;
        long l_num = 100;
        short s_num =  100;
        byte bt = 100;
        char chr = '\n';
        String x = "A";
        boolean bool = true;

        System.out.println(x+num);

        //final double PI = 3.14;
        double r = 2;
        System.out.println("area: " + PI*r*r);
    }
}
