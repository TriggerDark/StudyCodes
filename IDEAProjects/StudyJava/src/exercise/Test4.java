package exercise;

/**
 * @author SuperStar
 * 利用动态规划求两个字符串的最长公共子序
 */

public class Test4 {

    private int[][] L;
    private int[][] s;
    private int commonOrder(String x[],int m,String y[],int n,String z[]){

        this.L=new int[m+1][n+1];
        this.s=new int[m+1][n+1];
        int i,j,k;
        // 初始化第0行
        for (j = 0; j <= n; j++) {
            L[0][j]=0;
        }
        // 初始化第0列
        for (i = 0; i <=m; i++) {
            L[i][0]=0;
        }
        for (i = 0; i <=m-1; i++) {
            for (j = 0; j <= n - 1; j++) {
                int a, b;
                a = i + 1;
                b = j + 1;
                if (x[i] == y[j]) {
                    L[a][b] = L[a - 1][b - 1] + 1;
                    s[a][b] = 1;
                } else if (L[a][b - 1] >= L[a - 1][b]) {
                    L[a][b] = L[a][b - 1];
                    s[a][b] = 2;
                } else {
                    L[a][b] = L[a - 1][b];
                    s[a][b] = 3;
                }
            }
        }
        // 将公有子序列存储到数组z中
        i=m;j=n;k=L[m][n];
        while (i>0&&j>0) {
            if (s[i][j]==1) {
                z[k-1]=x[i-1];
                k--;
                i--;j--;
            } else if (s[i][j]==2) {
                j--;
            } else {
                i--;
            }
        }
        // 输出
        for (k = 0; k <L[m][n]; k++) {
            System.out.print(z[k]+" ");
        }
        return L[m][n];
    }
    public static void main(String[] args) {
        String a[]={"a","b","c","b","d","b"};
        String b[]={"a","c","b","b","a","b","d","b","b"};
        String z[];
        z=new String[10];
        int l=(new Test4()).commonOrder(a,a.length,b,b.length,z);
        System.out.println();
        System.out.println(l);
    }
}
