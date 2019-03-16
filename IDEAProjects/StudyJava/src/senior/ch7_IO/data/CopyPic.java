package senior.ch7_IO.data;

import java.io.*;

public class CopyPic {
    public static void main(String[] args) {
        //输入流
        FileInputStream fis = null;
        DataInputStream dis = null;

        //输出流
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            fis = new FileInputStream("star.jpg");
            dis = new DataInputStream(fis);

            fos = new FileOutputStream("copy.jpg");
            dos = new DataOutputStream(fos);

            int temp;
            while ((temp = dis.read()) != -1) {
                dos.write(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dos.close();
                fos.close();
                dis.close();
                fis.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
