package exercise.knapsack;

import java.io.*;

/**
 * @author SuperStar
 */

class TestWriter {
    public static void writeFile(File file, int size) {
        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            // 为文件写入第一行
            bw.write("S\tW\tV\n");
            // 随机生成数据集
            for (int i = 1; i <= size; i++) {
                String content = i + "\t" + ((int)(Math.random()*(size-1)) + 1) + "\t" + ((int)(Math.random()*(size-1)) + 1) + "\n";
                bw.write(content);
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
