package exercise;

import java.util.Arrays;

public class demo5 {
    private static void quickSort(int[] arr, int start, int end){
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
        //int max = 0, count = 1, i = 0, temp = 0;
        int[] arr = new int[]{1, 2, 3, 5, 3, 3, 3, 2, 5, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        for (int i=0; i<arr.length; i++) {
            if (i<arr.length/2){
                System.out.println("1: " + arr[i]);
            } else {
                System.out.println("2: " + arr[i]);
            }
        }
//        while (i < arr.length - 1) {
//            int j = i + 1;
//            if (arr[i] == arr[j]) {
//                count ++;
//                i ++;
//            } else {
//                if (count > max) {
//                    temp = arr[i];
//                    max = count;
//                }
//                count = 1;
//                i = j;
//            }
//        }
//        System.out.println(temp + "出现的次数最多，次数为：" + max + "次");
    }
}