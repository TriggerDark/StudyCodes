package exercise;

import java.util.Scanner;

public class demo7 {
    static int n;
    static int [][]a;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("请输入选手的个数n(n=2的k次方):");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n][n];
        for(int i=0;i<n;i++){
            a[0][i]=i+1;//初始化第一行
        }
        for(int r=1;r<n;r=r*2){
            for(int i=0;i<n;i+=2*r){
                day_func(0, i, r,r+i, r);
                day_func(0,i+r, r, i, r);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static void day_func(int ylt_x,int ylt_y,int mlt_x,int mlt_y,int r){
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[mlt_x+i][mlt_y+j]=a[ylt_x+i][ylt_y+j];
            }
        }
    }
}
