package dataStructure.SortAndSearch;

import java.util.Arrays;

public class shellSort {
    public static void shellSort(int[] arr){
        int gap = arr.length/2;
        while(gap >= 1){
            for(int i = gap; i < arr.length; i++){
                int j = i;
                while(j >= gap && arr[j] < arr[j - gap]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j - gap];
                    arr[j - gap] = temp;
                    j -= gap;
                }
            }
            gap /=2;
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{54, 26, 93, 17, 31, 44, 55};
        shellSort(arr);
        System.out.print(Arrays.toString(arr));
    }

}
