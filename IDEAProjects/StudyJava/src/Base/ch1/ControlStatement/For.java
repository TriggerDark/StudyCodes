package Base.ch1.ControlStatement;

import java.util.Scanner;

public class For {
    public static void main(String[] args){
        /*scanner input = new scanner(System.in);
        double sum = 0;
        for (int i = 1; i <= 5; i ++){
            System.out.print(i + ": ");
            double grade = input.nextDouble();
            sum += grade;
        }
        System.out.println("avg = " + sum/5);*/
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j ++){
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.print('\n');
        }
    }
}
