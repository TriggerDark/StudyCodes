package exercise;

import java.util.Arrays;

public class demo3 {

    public static void process(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++){
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 0, 0, 0, 1, 1, 2, 1, 0, 2, 2};
        System.out.println(Arrays.toString(a));
        process(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
