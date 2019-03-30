package b_senior.ch7_IO.FileInputAndOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author SuperStar
 * Methods
 *  InputStream:
 *      int read()
 *      int read(byte[] b)-->(返回读取到的字节数)一次性读取多个
 *      int read(byte[] b, int off, int len)
 *      void close()
 *  FileInputStream:
 *      new FileInputStream(File file)
 *      new FileInputStream(String filePath)
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("E:\\IDEAProjects\\StudyJava\\test.txt");
            System.out.println("可以读取的字节数：" + fileInputStream.available());
            int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }
//            byte[] bytes = new byte[1024];
//            int data;
//            while ((data = fileInputStream.read(bytes)) != -1) {
//                for (int i = 0; i < data; i++){
//                    System.out.print((char) bytes[i]);
//                }
//            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
