package senior.ch7_IO.reader;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        Reader fr = null;
        FileInputStream fis = null;
        BufferedReader br = null;
        try {
            fis = new FileInputStream("hello.txt");
            fr = new InputStreamReader(fis,"UTF-8");
            br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
