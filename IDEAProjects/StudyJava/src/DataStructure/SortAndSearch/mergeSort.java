package DataStructure.SortAndSearch;

import java.util.Arrays;

public class mergeSort {
    public static int[] mergeSort(int[] arr, int start, int end){
        if (end == 1)
            return arr;

        int mid = end/2;
        mergeSort(arr, start, mid);
        mergeSort(arr,mid + 1, end);
        int[] result = new int[100];

        int i = start, j = mid + 1, k = start;
        while(i <= mid && j <= end){
            if(arr[i] < arr[j]) result[k++] = arr[i++];
            else result[k++] = arr[j++];
        }
        while(i <= mid)
            result[k++] = arr[i++];
        while(j <= end)
            result[k++] = arr[j++];

        return result;
    }

    public static void main(String[] args){
        int[] arr = new int[]{54, 26, 93, 17, 31, 44, 55};
        int[] result = mergeSort(arr, 0, arr.length);
        System.out.print(Arrays.toString(result));
    }

}
