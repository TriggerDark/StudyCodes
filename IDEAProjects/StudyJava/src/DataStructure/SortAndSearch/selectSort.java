package DataStructure.SortAndSearch;

import java.util.Arrays;

public class selectSort {

    public static void selectSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;//初始化假定最小值下标索引min
            //内层：比较得出最小值，保存最小值的索引
            for (int j = min + 1; j < arr.length; j++){
                if(arr[min] > arr[j])
                    min = j;
            }
            //如果min的值发生改变，则交换元素值
            if(min != i){
                int temp;
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{54, 26, 93, 17, 31, 44, 55};
        selectSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
