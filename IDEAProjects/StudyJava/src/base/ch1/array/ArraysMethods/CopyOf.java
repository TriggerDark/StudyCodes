package Base.ch1.array.ArraysMethods;

import java.util.Arrays;

/**
 * copyOf()数组拷贝
 */

public class CopyOf {
    public static void main(String[] args) {
        int[] number = {2, 3, 4, 5, 11, 13};
        int[] copyNumber = number;
        copyNumber[5] = 12;
        //System.out.println(ArraysMethods.toString(copyNumber));
        int[] copNumber2 = Arrays.copyOf(copyNumber, copyNumber.length);
        int[] copNumber3 = Arrays.copyOf(copyNumber, 2 * copyNumber.length);
        System.out.println(Arrays.toString(copNumber2));
        System.out.println(Arrays.toString(copNumber3));
    }
}
