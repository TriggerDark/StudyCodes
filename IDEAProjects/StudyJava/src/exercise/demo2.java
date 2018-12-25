package exercise;

public class demo2 {
    public static void delete(int[] arr, int n){
        int[] temp = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++)
            temp[i] = arr[i];
        for (int i = 0; i < n-1; i++)
            for (int j = i+1; j < n; j++)
                if (temp[i] == temp[j])
                    temp[j] = -1;
        for (int i = 0; i < n; i++)
            if (temp[i] != -1){
                arr[count ++] = temp[i];
            }
        for (int i = 0; i < count; i++)
            System.out.println(arr[i]);
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 5, 2, 4};
        delete(arr, arr.length);
    }
    
}
