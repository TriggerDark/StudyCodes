package senior.ch7_IO.writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author SuperStar
 * Methods:
 *      字符串输出流(写)
 *          Writer
 *              write(String)
 *              close()
 *              flush()清空缓存
 *          OutputStreamWriter
 *              new OutputStreamWriter(OutputStream)
 *              new OutputStreamWriter(OutputStream, Strting charSetName)
 *          FileWriter
 *              new FileWriter(File file)
 *              new FileWriter(String path)
 *          BufferedWriter
 */

public class FileWriteDemo {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("hello.txt", true);
            String info = "追加写入文件";
            fw.write(info);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
