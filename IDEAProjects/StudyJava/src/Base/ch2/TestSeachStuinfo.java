package Base.ch2;

import java.util.Scanner;

public class TestSeachStuinfo {
   public static void main(String[] args) {
       StudentsInfo st = new StudentsInfo();
       Scanner input = new Scanner(System.in);

       //添加姓名
       for(int i = 0; i < 5; i++){
           System.out.print("请输入学生姓名：");
           String newName = input.next();
           st.addName(newName);
       }

       //显示姓名
       st.showName();

       System.out.print("输入开始位置：");
       int start = input.nextInt();
       System.out.print("结束位置：");
       int end = input.nextInt();
       System.out.print("查找姓名：");
       String sName = input.next();
       boolean flag = st.searchName(start, end, sName);

       if (flag){
           System.out.println("找到了");
       }else {
           System.out.println("没找到");
       }
   }
}
