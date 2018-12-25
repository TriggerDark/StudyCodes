package exercise;

/**
 * @author SuperStar
 */

public class Test2 {

    private static int maxSum(int[] a, int left, int right) {
        int sum = 0, midSum = 0, leftSum = 0, rightSum = 0;
        int center, s1, s2, lefts, rights;
        if (left == right) { sum = a[left]; }
        else {
            center = (left + right) / 2;
            // a(0)~a(n/2)的最大子段和
            leftSum = maxSum(a, left, center);
            // a(n/2 + 1)~a(n)的最大子段和
            rightSum = maxSum(a, center + 1, right);
            s1 = 0; lefts = 0;
            // 求取中点右边最大子段和
            for (int i = center; i >=left; i--) {
                lefts += a[i];
                if (lefts > s1) { s1 = lefts; }
            }
            s2 = 0; rights = 0;
            // 求取中点左边最大子段和
            for (int j = center + 1; j <= right; j++) {
                rights += a[j];
                if (rights > s2) { s2 = rights; }
            }
            // 两个最大子段和相加
            midSum = s1 + s2;
            // 合并解，取最大值
            if (midSum < leftSum) { sum = leftSum; }
            else { sum = midSum;}
            if (sum < rightSum) { sum = rightSum; }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {-20, 11, -4, 13, -5, -22};
        int maxSum = maxSum(arr, 0, arr.length - 1);
        System.out.println("最大字段和：" + maxSum);
    }
}
