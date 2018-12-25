package exercise;

public class demo4 {
    static int count;
    static char[][] a = {
            {'从','我','做','起','振'},
            {'我','做','起','振','兴'},
            {'做','起','振','兴','中'},
            {'起','振','兴','中','华'}
    };
    public static void jump(int x,int y,int n,char[] b){
        if(x>3||y>4||n>7)
            return;
        b[n]=a[x][y];
        if(n==7&&check(b)){
            count++;
        }
        jump(x+1,y,n+1,b);
        jump(x,y+1,n+1,b);
    }
    public static boolean check(char[] b){
        if("从我做起振兴中华".equals(String.valueOf(b))){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        count=0;
        char[] b = new char[8];
        jump(0,0,0,b);
        System.out.println(count);
    }
}
