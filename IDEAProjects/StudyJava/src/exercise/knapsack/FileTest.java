package exercise.knapsack;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileTest {

    /**计算最大物品总价值*/
    public static double knapsack(double[][] all, int C) {
        double maxValue = 0;
        for (int i = 0; all[i][0] <= C && C >= 0; i++) {
            maxValue += all[i][0];
            C -= all[i][0];
        }
        return maxValue;
    }

    /**对从文件中读取的数据进行分割*/
    public static double[][] splitString(ArrayList<String> arrayList) {
        String[] strings;
        double x, y;
        double[][] all= new double[arrayList.size()-1][3];
        for (int i = 1; i < arrayList.size(); i++) {
            // 把数据分割
            strings = arrayList.get(i).split("\t");
            // 把String类型的数据转化为int类型
            x = Integer.parseInt(strings[strings.length-2]);
            y = Integer.parseInt(strings[strings.length-1]);
            // 保存weight，value和weight/value
            all[i-1][0] = x;
            all[i-1][1] = y;
            all[i-1][2] = y/x;
        }
        return all;
    }

    public static void main(String[] args) {
        System.out.println("请输入需要写入同时需要读取的文件名：");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        File file = new File(fileName);
        System.out.println("请输入Size的大小");
        int size = scanner.nextInt();

        TestWriter.writeFile(file, size);
        ArrayList<String> arrayList =  TestReader.readFile(file);

        double[][] all= splitString(arrayList);
        TestSort.quickSort(all, 0, all.length -1, 2);
        //用于检验数据是否按降序排序
//        for (int i = 0; i < all.length; i++) {
//            for (int j = 0; j < all[i].length; j ++) {
//                System.out.print(all[i][j] + "\t");
//            }
//            System.out.println();
//        }
        System.out.println("设置背包容量: ");
        int C = scanner.nextInt();
        long startTime = System.nanoTime();
        double maxValue = knapsack(all, C);
        long endTime = System.nanoTime();
//        System.out.println(startTime);
//        System.out.println(endTime);
        System.out.println("目前装包最大价值为：" + maxValue +
                "， 所占用的时间为：" +(endTime-startTime) + "(ns)");
    }
}
