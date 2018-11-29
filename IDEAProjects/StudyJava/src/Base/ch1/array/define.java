package Base.ch1.array;

/**
 * 一维数组定义
 */

public class define {
    public static void main(String[] args) {
        int[] a;
        a = new int[]{1, 2, 3, 4};
        int[] c = new int[5];
        int b[] = new int[5];
        for(int i = 0; i < c.length; i++){
            c[i] = i;
            System.out.println(c[i]);
        }
    }
}
