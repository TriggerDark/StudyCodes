package exercise.knapsack;

import java.io.*;
import java.util.ArrayList;

/**
 * @author SuperStar
 */

class TestReader {
    private static ArrayList<String> arrayList = new ArrayList<>();
    public static ArrayList<String> readFile(File file) {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            // 读取的数据
            String s;
            while (true) {
                // 按行读文件，并对读取的数据进行保存
                s= bf.readLine();
                // 读取为null时，读文件结束
                if (s == null) {
                    break;
                }
                arrayList.add(s);
            }
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
