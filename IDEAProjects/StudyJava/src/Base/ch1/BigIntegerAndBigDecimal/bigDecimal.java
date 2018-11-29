package Base.ch1.BigIntegerAndBigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class bigDecimal {

    public static void main(String[] args) {
        final int PRECISION = 31;
        final int THENUMBEROFCIRCLES = 23;
        BigDecimal PI = new BigDecimal(0);
        System.out.println("正在计算中...请稍后...");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < THENUMBEROFCIRCLES; i++) {
            PI = PI.add((BigDecimal.valueOf(1).divide(BigDecimal.valueOf(16).pow(i))).multiply((BigDecimal.valueOf(4)
                    .divide(BigDecimal.valueOf(8).multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(1)), PRECISION, BigDecimal.ROUND_DOWN))
                    .subtract(BigDecimal.valueOf(2).divide(BigDecimal.valueOf(8).multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(4)), PRECISION,BigDecimal.ROUND_DOWN))
                    .subtract((BigDecimal.valueOf(1).divide(BigDecimal.valueOf(8).multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(5)), PRECISION,BigDecimal.ROUND_DOWN)))
                    .subtract((BigDecimal.valueOf(1).divide(BigDecimal.valueOf(8).multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(6)), PRECISION,BigDecimal.ROUND_DOWN)))));
        }
        System.out.println("PI=" + PI.setScale(30, BigDecimal.ROUND_DOWN) + "\n共用时："
                + (System.currentTimeMillis() - startTime) / 1000.0 + "秒");
    }
}