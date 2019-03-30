package dataStructure.SortAndSearch;

import java.util.Arrays;

public class quickSortT {
    public static int partition(int[] arr, int start, int end){
        int low = start;
        int high = end;
        int pivot = arr[start];
        int index = start;

        while(low <= high){
            while(low <= high){
                if(arr[high] < pivot){
                    arr[index] = arr[high];
                    index = high;
                    low ++;
                    break;
                }
                high --;
            }
            while(low <= high){
                if(arr[low] > pivot){
                    arr[index] = arr[low];
                    index = low;
                    high --;
                    break;
                }
                low ++;
            }
        }
        arr[index] = pivot;
        return index;
    }

    public static void quickSort(int[] arr, int start, int end){
        if(start >= end)
            return;
        int index = partition(arr, start, end);
        quickSort(arr, start, index - 1);
        quickSort(arr, index + 1, end);
    }
    public static void main(String[] args){
        int[] arr = new int[]{54, 26, 93, 17, 31, 44, 55, 66};
        quickSort(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }
}
