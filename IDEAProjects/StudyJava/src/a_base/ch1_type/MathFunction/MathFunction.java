package base.ch1.MathFunction;

public class MathFunction {
    public static void main(String[] args){
        double x = 100;
        double y = Math.sqrt(x);
        System.out.println("100的平方根: " + y);
        System.out.println("-10的绝对值" + Math.abs(-10));
        System.out.println("10和100最小值： " + Math.min(10, 100) + "最大值：" + Math.max(10, 100));
        System.out.println("四舍五入" + Math.round(10.66));
    }
}
