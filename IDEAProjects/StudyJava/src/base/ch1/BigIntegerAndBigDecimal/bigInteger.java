package base.ch1.BigIntegerAndBigDecimal;

import java.math.BigInteger;
import java.util.Scanner;

public class bigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        BigInteger bi = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++){
            bi = bi.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
            System.out.println(bi);
        }
    }
}
