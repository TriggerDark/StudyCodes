package senior.ch7_IO.FileInputAndOutputStream;

import java.io.File;
import java.io.IOException;

/**
 * 文件操作： 创建文件 查看文件相关信息 删除文件
 * @author SuperStar
 * Methods:
 *      boolean exists()
 *      void createNewFile()
 *      boolean isFile()
 *      boolean isDirectory()
 */

public class FileDemo {
    //创建文件
    public void create(File file){
        //判断文件是否存在
        if (!file.exists()){
            try {
                file.createNewFile();
                System.out.println("文件已经创建");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //查看文件信息
    public void showFileInfo(File file){
        if (file.exists()){
            if (file.isFile()){
                System.out.println("文件名：" + file.getName());
                System.out.println("相对路径：" + file.getPath());
                System.out.println("绝对路径：" + file.getAbsolutePath());
                System.out.println("文件大小：" + file.length() + "字节");
                System.out.println(file.getAbsolutePath().startsWith("E:\\IDEAProjects\\StudyJava"));
            }
            if (file.isDirectory()){
                System.out.println("文件为目录");
            }
        } else {
            System.out.println("文件不存在");
        }
    }

    //删除文件
    public void delete(File file){
        if (file.exists()) {
            file.delete();
            System.out.println("文件已经删除");
        }
    }

    public static void main(String[] args) {
        FileDemo fileDemo = new FileDemo();
        File file = new File("test.txt");
        //fileDemo.create(file);
        fileDemo.showFileInfo(file);
        //fileDemo.delete(file);
    }

}
