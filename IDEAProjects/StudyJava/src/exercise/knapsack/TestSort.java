package exercise.knapsack;

class TestSort {
    /**
     * 因为要把相关的weight、value和value/weight三个数据，相互关联
     * 所以使用二维数组进行快排
     */
    public static void quickSort(double[][] arr, int start, int end, int C){
        if(start < end){
            int left = start;
            int right = end;
            double pivot0 = arr[start][0];
            double pivot1 = arr[start][1];
            double pivot2 = arr[start][C];

            while(left < right){
                while(left < right && arr[right][C] <= pivot2) { right --;}
                arr[left][0] = arr[right][0];
                arr[left][1] = arr[right][1];
                arr[left][2] = arr[right][2];
                while(left < right && arr[left][C] > pivot2) { left ++; }
                arr[right][0] = arr[left][0];
                arr[right][1] = arr[left][1];
                arr[right][2] = arr[left][2];
            }
            arr[left][0] = pivot0;
            arr[left][1] = pivot1;
            arr[left][2] = pivot2;
            quickSort(arr, start, left - 1, 2);
            quickSort(arr, left + 1, end, 2);
        }
    }
}
