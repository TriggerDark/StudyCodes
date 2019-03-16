package senior.ch7_IO.FileInputAndOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author SuperStar
 * 复制文件
 */
public class InputAndOutDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("我的青春谁做主.txt");
            fos = new FileOutputStream("hello.txt", true);
            byte[] words = new byte[1024];
            int len = -1;
            while ((len = fis.read(words)) != -1) {
                fos.write(words, 0, len);
            }
            fos.flush();
            System.out.println("文件复制完成！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
