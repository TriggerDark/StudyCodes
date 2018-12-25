package base.ch1.array.ArraysMethods;

        import java.util.Arrays;

/**
 * boolean equals(type[] a, type[] b)
 *      如果两个数组长度相同，相同坐标下的元素对应相等，返回true
 * fill(arrayName, val) --> 为arrayName的所有数据元素赋值为val
 * binarySearch() -->二分查找
 */

public class ArraysMethods {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 4};
        int[] arr3 = {1, 2, 3};

        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));
        System.out.println("********************");

        Arrays.fill(arr2, 40);
        System.out.println(Arrays.toString(arr2));
        System.out.println("********************");

        int[] number = {9, 7, 67, 53, 24};
        Arrays.sort(number);//{7, 9, 24, 53, 67}
        System.out.println(Arrays.binarySearch(number, 53));
    }
}
