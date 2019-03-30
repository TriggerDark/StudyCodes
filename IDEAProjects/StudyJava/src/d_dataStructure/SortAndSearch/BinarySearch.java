package dataStructure.SortAndSearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int start, int end, int key){
        int mid = (start + end)/2;
        if (mid > 0) {
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                return binarySearch(arr, start, mid, key);
            } else {
                return binarySearch(arr, mid + 1, end, key);
            }
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(arr, 0, arr.length, 4));
        System.out.println(binarySearch(arr, 0, arr.length, 0));
    }
}
