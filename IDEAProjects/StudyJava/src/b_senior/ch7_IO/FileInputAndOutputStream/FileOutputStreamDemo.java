package senior.ch7_IO.FileInputAndOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author SuperStar
 * Methods:
 *  OutputStream:
 *      void write()
 *      void write(byte[] b)
 *      void write(byte[] b, int off, int len)
 *      void flush()--->强制将缓冲区清空
 *  FileOutputStream:
 *      new FileOutputStream(File file)
 *      new FileOUtputStream(String filePath)
 *      new FileOUtputStream(String filePath, boolean append)
 *              覆盖或追加
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("E:\\IDEAProjects\\StudyJava\\write.txt");
            String str = "好好学习Java";
            byte[] words = str.getBytes();
            fileOutputStream.write(words, 0, words.length);
            System.out.println("写入完成!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
