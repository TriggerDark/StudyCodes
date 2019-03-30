package base.ch1.ControlStatement;

public class Break {
    public static void main(String[] args) {
        int count = 0;
        outer:
        while(true){
            for(int i = 0; i < 10; i++){
                count ++;
                if(i == 6)
                    break outer;
            }
        }
        System.out.println(count);
    }
}
