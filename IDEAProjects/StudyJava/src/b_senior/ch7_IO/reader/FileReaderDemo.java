package b_senior.ch7_IO.reader;

import java.io.*;

/**
 * @author SuperStar
 * Methods:
 *  字符输入流(读)：
 *      Reader(父)
 *          int read()
 *          int read(char[])
 *          int read(char[], off, len)
 *      InputStreamReader(子)
 *          new InputStreamReader(InputStream)
 *          new InputStreamReader(InputStream, String charSetName)
 *      FileReader(孙)
 *          new FileReader(File file)
 *          new FileReader(String path)
 *      缓冲流BufferedReader
 *          readLine()
 */

public class FileReaderDemo {
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.encoding"));
        //FileReader fr = null;
        Reader fr = null;
        FileInputStream fis = null;
        try {
            //fr = new FileReader("hello.txt");
            fis = new FileInputStream("hello.txt");
            fr = new InputStreamReader(fis,"UTF-8");
            StringBuffer s = new StringBuffer();
            char[] chars = new char[1024];
            int len = -1;
            while ((len = fr.read(chars)) != -1) {
                s.append(chars);
            }
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
