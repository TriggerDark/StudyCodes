package b_senior.ch7_IO.writer;

import java.io.*;

public class Exercise {
    public static void main(String[] args) {
        //输入流读取
        FileInputStream fis = null;
        InputStreamReader ir = null;
        BufferedReader br = null;

        //输出流写入
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fis = new FileInputStream("pet.template");
            ir = new InputStreamReader(fis, "UTF-8");
            br = new BufferedReader(ir);
            StringBuffer s = new StringBuffer();
            String line = null;
            while ((line = br.readLine()) != null) {
                s.append(line);
            }
            System.out.println("替换前的内容是：" + s);
            String string = s.toString().replace("{name}", "欧欧").replace("{type}", "狗狗").replace("{master}", "李伟 ");
            System.out.println("替换后的内容是：" + string);

            //把新内容写入文件
            fw = new FileWriter("pet.txt");
            bw = new BufferedWriter(fw);
            bw.write(string);
            bw.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                ir.close();
                br.close();

                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
