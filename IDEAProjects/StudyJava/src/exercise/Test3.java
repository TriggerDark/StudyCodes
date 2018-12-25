package exercise;

/**
 * @author SuperStar
 */

public class Test3 {
    private static int searchMid(int A[], int B[], int n) {
        int s1 = 0, e1 = n - 1, s2 = 0, e2 = n - 1;
        int mid1, mid2;
        while (s1 < e1 && s2 < e2) {
            // 数组A的中位数
            mid1 = (s1 + e1) / 2;
            // 数组B的中位数
            mid2 = (s2 + e2) / 2;
            // 如果数组A的中位数和数组B的中位数相等，那么这个数就是两个数列的中位数
            if (A[mid1] == B[mid2]) {
                return A[mid1];
            }
            // 如果数组A的中位数小于数组B的中位数
            if (A[mid1] < B[mid2]) {
                // 舍弃数组A左边的元素
                if ((s1 + e1) % 2 == 0) {
                    s1 = mid1;
                } else {
                    s1 = mid1 + 1;
                }
                // 舍弃数组B右边的元素
                e2 = mid2;
            } else {
                // 如果数组A的中位数大于于数组B的中位数
                // 舍弃数组A右边的元素
                if ((s2 + e2) % 2 == 0) {
                    s2 = mid2;
                } else {
                    s2 = mid2 + 1;
                }
                // 舍弃数组B左边的元素
                e1 = mid1;
            }
        }
        if (A[s1] < B[s2]) {
            return A[s1];
        } else {
            return B[s2];
        }
    }

    public static void main(String[] args) {
        int[] A = {11, 13, 15, 17, 19};
        int[] B = {2, 4, 10, 15, 20};
        int temp = searchMid(A, B, A.length);
        System.out.println(temp);
    }
}
