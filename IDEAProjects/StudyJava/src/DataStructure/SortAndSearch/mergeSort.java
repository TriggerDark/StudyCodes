package DataStructure.SortAndSearch;

import java.util.Arrays;

public class mergeSort {
    public static void sort(int[] arr, int start, int end, int[] sorted){
        if(start < end){
            int mid = (start + end) / 2;
            sort(arr, start, mid, sorted);
            sort(arr,mid + 1, end, sorted);
            merge(arr, start, mid, end, sorted);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end, int[] sorted){
        int fStart = start, lStart = mid + 1, index = 0;

        while(fStart <= mid && lStart <= end){
            if(arr[fStart] <= arr[lStart]){
                sorted[index++] = arr[fStart++];
            }else{
                sorted[index++] = arr[lStart++];
            }
        }
        while(fStart <= mid){
            sorted[index++] = arr[fStart++];
        }
        while(lStart <= end){
            sorted[index++] = arr[lStart++];
        }
        index = 0;
        while (start <= end){
            arr[start ++] = sorted[index ++];
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{54, 26, 93, 17, 31, 44, 55};
        System.out.println(Arrays.toString(arr));
        int[] sorted = new int[arr.length];
        sort(arr, 0, arr.length-1, sorted);
        System.out.println(Arrays.toString(sorted));
    }

}
