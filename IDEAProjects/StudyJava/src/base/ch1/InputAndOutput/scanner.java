package Base.ch1.InputAndOutput;

public class scanner {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("请输入姓名：");
        String name = input.nextLine();

        System.out.println("请输入性别：");
        String sex = input.next();

        System.out.println("请输入年龄：");
        int age = input.nextInt();

        System.out.println("请输入成绩：");
        double grade = input.nextDouble();

        System.out.println("姓名：" + name);
        System.out.println("性别：" + sex);
        System.out.println("年龄：" + age);
        System.out.println("成绩：" + grade);
    }
}
