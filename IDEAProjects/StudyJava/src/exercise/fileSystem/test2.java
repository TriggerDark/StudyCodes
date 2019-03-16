package exercise.fileSystem;

import java.io.File;

public class test2 {

    static long size = 0;

    public long getDirSize(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    getDirSize(files[i]);
                }
            } else {
                size += file.length();
            }
        } else {
            System.out.println("文件不存在！");
        }
        return size;
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\SuperStar\\Desktop\\hah");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(new test2().getDirSize(file));
    }
}
