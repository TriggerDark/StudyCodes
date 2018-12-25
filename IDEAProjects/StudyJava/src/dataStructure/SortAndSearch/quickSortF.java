package DataStructure.SortAndSearch;

import java.util.Arrays;

public class quickSortF {
    public static void quickSort(int[] arr, int start, int end){
        if(start < end){
            int left = start;
            int right = end;
            int pivot = arr[start];

            while(left < right){
                while(left < right && arr[right] >= pivot) right --;
                arr[left] = arr[right];
                while(left < right && arr[left] < pivot) left ++;
                arr[right] = arr[left];
            }
            arr[left] = pivot;
            quickSort(arr, start, left - 1);
            quickSort(arr, left + 1, end);
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{54, 26, 93, 17, 31, 44, 55};
        quickSort(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }
}
