package exercise.fileSystem;

import java.util.Scanner;

public class Main {

    private static boolean sStarsWith(String string, String key){
        if (string.toLowerCase().trim().startsWith(key)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("...... 欢迎使用本文件系统 ....\n" +
                            "........ 系统初始化中 ........");
        System.out.println("****** 默认用户建立中 ******\n" +
                            "***** 默认用户文件夹建立中 *****");
        Disk disk = new Disk();
        disk.initial(new User());
        System.out.println("*****************************");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(disk.filePath + " : ");
            String string = scanner.nextLine();
            String[] strings;
            if (!string.equals("exit")) {
                if (string.trim().contains(" ")) {
                    strings = string.trim().split(" ");
                    if (sStarsWith(string, "adduser")) {
                        if (disk.checkPd() == 1) {
                            disk.addUser(new User(strings[1]));
                        }
                    } else if(sStarsWith(string, "passwd")) {
                        if (disk.checkPd() == 1) {
                            disk.changePd(strings[1]);
                        }
                    } else if (sStarsWith(string, "deluser")) {
                        if (disk.checkPd() == 1) {
                            disk.delUser(new User(strings[1]));
                        }
                    } else if (sStarsWith(string, "su")){
                        if (disk.checkPd() == 1) {
                            disk.changeUser(strings[1]);
                        }
                    } else if (sStarsWith(string, "mkdir")) {
                        disk.makedir(strings[1]);
                    } else if (sStarsWith(string, "rmdir")) {
                        disk.rmdir(strings[1]);
                    } else if (sStarsWith(string, "touch")) {
                        disk.createFile(strings[1]);
                    } else if (sStarsWith(string, "rmfile")) {
                        disk.rmFile(strings[1]);
                    } else if (sStarsWith(string, "vim")) {
                        disk.writeFile(strings[1]);
                    } else if (sStarsWith(string, "cat")) {
                        disk.readFile(strings[1]);
                    } else if (sStarsWith(string, "cd")) {
                        disk.changeDirectory(strings[1]);
                    }
                } else if (string.trim().equals("ls")){
                    disk.showFiles();
                } else if (string.trim().equals("whoami")) {
                    disk.whoAmI();
                } else if (string.trim().equals("au")) {
                    disk.printUsers();
                } else if (string.trim().equals("pwd")) {
                    disk.pwd();
                } else {
                    System.out.println("指令为空！");
                }
            } else {
                disk.getDirSize();
                disk.removeAll();
                break;
            }
        }
    }

}
