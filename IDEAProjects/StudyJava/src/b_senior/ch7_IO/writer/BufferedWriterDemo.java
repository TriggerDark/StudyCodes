package senior.ch7_IO.writer;

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("hello.txt", true);
            bw = new BufferedWriter(fw);
            String info = "追加写入文件";
            bw.newLine();
            bw.write(info);
            bw.flush();

            fr = new FileReader("hello.txt");
            br = new BufferedReader(fr);

            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
                bw.close();
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
