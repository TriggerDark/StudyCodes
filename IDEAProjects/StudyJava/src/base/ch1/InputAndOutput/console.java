package Base.ch1.InputAndOutput;

import java.io.Console;

public class console {
    public static void main(String[] args) {
        Console cons = System.console();
        if (cons != null) {
            String username = cons.readLine("User name: ");
            char[] passwd = cons.readPassword("Password: ");
            System.out.print(username + " " + passwd);
        }else {
            System.out.print("hello");
        }
    }
}
