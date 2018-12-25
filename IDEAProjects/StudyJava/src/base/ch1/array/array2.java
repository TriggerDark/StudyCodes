package Base.ch1.array;

import java.util.Arrays;

/**
 * 二维数组
 */

public class array2 {
    public static void main(String[] args) {
        int[][] balance = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };

        for (int i=0; i<balance.length; i++){
            for(int j=0; j<balance[i].length; j++){
                System.out.print(balance[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("****************************");

        for(int[] ele:balance){
            for(int eles:ele){
                System.out.print(eles + " ");
            }
            System.out.println();
        }
        System.out.println("*****************************");

        System.out.println(Arrays.deepToString(balance));
    }
}
