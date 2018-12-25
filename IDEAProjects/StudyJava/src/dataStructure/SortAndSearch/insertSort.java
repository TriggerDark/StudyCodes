package DataStructure.SortAndSearch;

import java.util.Arrays;

public class insertSort {

    public static void insertSort(int[] arr){
        for (int j = 1; j < arr.length; j++){
            int i = j;
            while(i > 0){
                if(arr[i] < arr[i - 1]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    i --;
                }
                else
                    break;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{54, 26, 93, 17, 31, 44, 55};
        insertSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
