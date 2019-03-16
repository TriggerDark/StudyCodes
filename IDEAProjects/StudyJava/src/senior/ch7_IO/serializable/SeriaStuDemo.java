package senior.ch7_IO.serializable;

import java.io.*;

public class SeriaStuDemo {
    public static void main(String[] args) {
        Student stu = new Student("小红", 18, "女", "123456");

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            fos = new FileOutputStream("student.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(stu);

            fis = new FileInputStream("student.txt");
            ois = new ObjectInputStream(fis);
            Student student = (Student) ois.readObject();
            System.out.println(student.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
