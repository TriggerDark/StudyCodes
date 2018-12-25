package Base.ch1.array;

public class Args {
    public static void main(String[] args) {
        if (args.length == 0|| args[0].equals("-h")) {
            System.out.println("Hello");
        }else if(args[0].equals("-g")) {
            System.out.println("Goodbye,");
        }
        for (int i = 0; i < args.length; i++){
            System.out.print(" " + args[i]);
        }
        System.out.println("！");
    }
}
