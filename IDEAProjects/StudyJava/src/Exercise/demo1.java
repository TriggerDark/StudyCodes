package Exercise;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        while(num > 0){
            sum += num % 100;
            num /= 100;
        }
        if(sum % 11 == 0)
            System.out.println("Can");
    }
}
