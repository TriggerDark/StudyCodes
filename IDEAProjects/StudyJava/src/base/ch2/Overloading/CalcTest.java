package Base.ch2.Overloading;

/**
 * overload:
 *      重载
 *      有相同的方法名，不同的参数
 */

public class CalcTest {

    public int add(int num1, int num2){
        return num1+num2;
    }

    public double add(double num1, double num2){
        return num1+num2;
    }

    public double add(double num1, double num2, double num3){
        return num1+num2+num3;
    }
    public static void main(String[] args) {
        CalcTest c = new CalcTest();
        System.out.println(c.add(1, 2));
        System.out.println(c.add(1.2, 1.3));
        System.out.println(c.add(1.3, 4.0, 5.6));
    }
}
