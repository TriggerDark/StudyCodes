package base.ch1.ControlStatement;

public class IF {
    public static void main(String[] args){
        int a = 0;
        if(a >= 90) {
            System.out.println("优秀");
        }
        else if(a >= 80)
            System.out.println("良");
        else if (a >= 70)
            System.out.println("不错");
        else if(a >= 60)
            System.out.println("及格");
        else
            System.out.println("不及格");
    }
}
