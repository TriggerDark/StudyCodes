package base.ch1.ControlStatement;

public class Switch {
    public static void main(String[] args){
        int Num = 1;
        switch(Num){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.print("3");
            default:
                System.out.println("default");
        }
    }
}
