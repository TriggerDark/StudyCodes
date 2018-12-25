package base.ch1.array.ArraysMethods;

/**
 * sort()-->快速排序
 * toString()--> 返回数据元素的字符串
 */

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] number = new int[]{1, 3, 6, 2, 9, 4};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
    }
}
