package exercise.fileSystem;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    static final String DISK_NAME = "D:\\disk";
    static String filePath = "jihaitao";
    static int flag = 1;
//    public static void changeDirectory(String string){
//        String tmp = filePath;
//        String[] strings = string.trim().toLowerCase().split("/");
//        for (String str:strings){
//            flag = cdic(str);
//            if (flag == 0){
//                filePath = tmp;
//                break;
//            }
//        }
//        System.out.println(filePath);
//    }
//    public static int cdic(String string) {
//        String absolutePath = DISK_NAME + "\\" + filePath;
//        String[] strings = absolutePath.toLowerCase().split("\\\\");
//        ArrayList<String> arrayList = new ArrayList<>();
//        for (String s:strings) { arrayList.add(s); }
//        int size = arrayList.size();
//
//        if (string.matches("^(\\.*)$")) {
//            if (string.equals(".")){
//                flag = 1;
//            } else if (string.equals("..") ) {
//                filePath = "";
//                if (size == 3) {
//                    flag = 0;
//                } else if (size > 3) {
//                    arrayList.remove(size-1);
//                    for (int i = 2; i < arrayList.size();i++){
//                        if (i == (arrayList.size() -1)) {
//                            filePath += arrayList.get(i);
//                        } else {
//                            filePath += arrayList.get(i);
//                            filePath += "\\";
//                        }
//                    }
//                    flag = 1;
//                }
//            } else {
//                flag = 0;
//            }
//        } else {
//            File file = new File(absolutePath + "\\" + string);
//            if (file.exists() && file.isDirectory()) {
//                filePath = (absolutePath + "\\" + string).replace(DISK_NAME+ "\\", "");
//                flag = 1;
//            } else {
//                flag = 0;
//            }
//        }
//        return flag;
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        //changeDirectory(string);
    }
}
//File file = new File(DISK_NAME);
        /*if (file.exists()) {
            if (file.isDirectory()) {
                //判断是否有文件夹
                if (file.list().length > 0) {
                    //路径
                    String path = user.getName();
                    Set<String> set = AllFiles(DISK_NAME);
                    String string = path.toLowerCase();
                    if (set.contains(string)) {
                        userSet.add(user);
                        filePath = userName = user.getName();
                    } else {
                        userSet.add(user);
                        mkUserDir(user.getName());
                        filePath = userName = user.getName();
                    }
                } else {
                    userSet.add(user);
                    mkUserDir(user.getName());
                    filePath = userName = user.getName();
                }
            }
        } else {
            file.mkdir();
            addUser(user);
        }*/