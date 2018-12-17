package Base.ch5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {
        Throws t = new Throws();
        try {
            t.divide();
        } catch (ArithmeticException e) {
            System.out.println("数字异常");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("end");
        }
    }
    public void divide() throws ArithmeticException, InputMismatchException {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int num1 = in.nextInt();
        System.out.println("请输入除数：");
        int num2 = in.nextInt();
        System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
    }
}
