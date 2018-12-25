package Base.ch2.FactoryMethod;

import java.text.NumberFormat;

public class FactoryMethod {
    public static void main(String[] args) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormat.format(x));
        System.out.println(percentFormat.format(x));
    }
}
