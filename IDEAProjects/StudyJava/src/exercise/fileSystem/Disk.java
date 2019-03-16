package exercise.fileSystem;

import java.io.*;
import java.util.*;

public class Disk {
    private static final String DISK_NAME = "D:\\Disk";//虚拟盘
    Set<User> userSet = new HashSet<>();//保存所有用户信息
    public String filePath = "lirongwei";//记录用户路径
    public String userName = "lirongwei";//记录当前用户信息
    public int flag = 1;//用于判断
    Scanner scanner = new Scanner(System.in);

    public void initial(User user) { //根磁盘初始信息
        File file = new File(DISK_NAME);
        if (file.exists()) {
            if (file.isDirectory()) {
                userSet.add(user);
                mkUserDir(user.getName());
                filePath = userName = user.getName();
            } else {
                file.mkdir();
                addUser(user);
            }
        } else {
            file.mkdir();
            addUser(user);
        }
    }

    public void addUser(User user) {
        if (!userSet.contains(user)) {
            userSet.add(user);
            mkUserDir(user.getName());
        }
    }

    public void delUser(User user) {//删除用户
        if (hasUser(user)) {
            if (!userSet.isEmpty()) {
                File file = new File(DISK_NAME + "\\" + user.getName());
                if (!user.getName().equals(userName)) {
                    deleteDir(file);
                    userSet.remove(user);
                    System.out.println("    *--- " + user.getName() + "用户已删除！---*");
                } else {
                    if (userSet.size() >= 2) {
                        Iterator<User> iterator = userSet.iterator();
                        while (iterator.hasNext()) {
                            User u = iterator.next();
                            if (!user.getName().equals(u.getName())) {
                                changeUser(u.getName());
                                filePath = userName = u.getName();
                                break;
                            }
                        }
                        userSet.remove(user);
                        deleteDir(file);
                        System.out.println("    *--- " + user.getName() + "用户已删除！---*");
                    } else {
                        userSet.remove(user);
                        deleteDir(file);
                        System.out.println("    *--- " + user.getName() + "用户已删除！---*");
                        User u = new User();
                        addUser(u);
                        changeUser(u.getName());
                    }
                }
            }
        } else {
            System.out.println("    *--- 不存在用户" + user.getName() + "！---*");
        }
    }

    public void changeUser(String qUserName) {//切换用户
        if (hasUser(qUserName)) {
            filePath = qUserName;
            userName = qUserName;
        } else {
            System.out.println("    *--- 用户不存在！---*");
        }
    }

    public void whoAmI() {//当前用户
        System.out.println("    *---  当前用户为：" + userName + "  ---*");
    }

    public void changePd(String name) {//修改密码
        if (hasUser(name)){
            System.out.print("请输入新的密码: ");
            String s = scanner.next();
            User user = new User(name);
            userSet.remove(user);
            user.setPassword(s);
            userSet.add(user);
        } else {
            System.out.println("    *--- 不存在用户" + name + "！无法修改密码 ---*");
        }
    }

    public int checkPd() {
        int pflag = 0;
        System.out.print("请输入当前用户密码：");
        String passwd = scanner.next();
        Iterator<User> iterator = userSet.iterator();
        while (iterator.hasNext()) {
            User currentUser = iterator.next();
            if (currentUser.getName().equals(userName)) {
                if (currentUser.getPassword().equals(passwd)){
                    System.out.println("    *--- 密码正确，执行命令！---*");
                    pflag = 1;
                } else {
                    System.out.println("    *--- 密码错误，命令无效！---*");
                    pflag = 0;
                }
                break;
            }
        }
        return pflag;
    }

    public void printUsers() {
        for (User user:userSet) {
            System.out.println("    " + user.getName() + " -- " + user.getPassword());
        }
    }
    public boolean hasUser(String name) {
        User user = new User(name);
        if (userSet.contains(user)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasUser(User user) {
        if (userSet.contains(user)) {
            return true;
        } else {
            return false;
        }
    }

    public void changeDirectory(String string){
        String tmp = filePath;
        String[] strings = string.trim().toLowerCase().split("/");
        for (String str:strings){
            flag = cdic(str);
            if (flag == 0){
                filePath = tmp;
                System.out.println("    *--- 路径错误！---*");
                break;
            }
        }
    }

    public int cdic(String string) {
        String absolutePath = DISK_NAME + "\\" + filePath;
        String[] strings = absolutePath.toLowerCase().split("\\\\");
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s:strings) { arrayList.add(s); }
        int size = arrayList.size();

        if (string.matches("^(\\.*)$")) {
            if (string.equals(".")){
                flag = 1;
            } else if (string.equals("..") ) {
                filePath = "";
                if (size == 3) {
                    flag = 0;
                } else if (size > 3) {
                    arrayList.remove(size-1);
                    for (int i = 2; i < arrayList.size();i++){
                        if (i == (arrayList.size() -1)) {
                            filePath += arrayList.get(i);
                        } else {
                            filePath += arrayList.get(i);
                            filePath += "\\";
                        }
                    }
                    flag = 1;
                }
            } else {
                flag = 0;
            }
        } else {
            File file = new File(absolutePath + "\\" + string);
            if (file.exists() && file.isDirectory()) {
                filePath = (absolutePath + "\\" + string).replace(DISK_NAME+ "\\", "");
                flag = 1;
            } else {
                flag = 0;
            }
        }
        return flag;
    }

    public long size = 0;

    public void getDirSize() {
        File file = new File(DISK_NAME);
        cal(file);
        System.out.println("磁盘所占字节：" + size + " (字节)");
    }
    public void cal(File file) {
        if (file.isFile()) {
            size += file.length();
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                cal(files[i]);
            }
        }
    }

    //创建用户文件夹
    public void mkUserDir(String uName) {
        File file = new File(DISK_NAME + "\\" + uName);
        dir(file);
    }

    // 创建普通文件夹
    public void makedir(String path) {
        File file = new File(DISK_NAME + "\\"+ filePath + "\\" + path);
        dir(file);
    }

    public void dir(File file){
        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("*----- 文件夹已经存在 -----*");
            } else {
                file.mkdir();
                System.out.println("*----- 文件夹创建成功 -----*");
            }
        } else {
            file.mkdir();
            System.out.println("*----- 文件夹创建成功 -----*");
        }
    }

    public static void deleteDir(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File f : file.listFiles()) {
                    deleteDir(f);
                }
            }
            file.delete();
        } else {
            System.out.println("*----- 文件夹不存在 -----*");
        }
    }

    public void rmdir(String fileName) {
        File file = new File(DISK_NAME + "\\"+ filePath + "\\" + fileName);
        deleteDir(file);
    }

    public void removeAll() {
        File file = new File(DISK_NAME);
        deleteDir(file);
    }

    public void rmFile(String fileName){
        File file = new File(DISK_NAME + "\\"+ filePath + "\\" + fileName);
        if (file.exists() && file.isFile()) {
            file.delete();
        } else {
            System.out.println("*..." + fileName + "文件不存在 ...*");
        }
    }

    // 文件目录信息
    public void showFiles() {
        String path = DISK_NAME + "\\"+ filePath;
        File file = new File(path);
        String[] strings = file.list();
        if (strings.length > 0) {
            for (int i = 0; i < strings.length; i++) {
                if (new File(path + "\\" + strings[i]).isDirectory()) {
                    System.out.print(strings[i] + "/\t");
                } else {
                    System.out.print(strings[i] + "\t");
                }
                if ((i + 1) % 3 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    public void createFile(String fileName){
        File file = new File(DISK_NAME + "\\"+ filePath + "\\" + fileName);
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("*..." + fileName + "已经存在！...*");
            } else {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void pwd() {
        System.out.println(DISK_NAME + "\\"+ filePath);
    }

    public void writeFile(String fileName) {
        String path = DISK_NAME + "\\"+ filePath + "\\" + fileName;
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            String s;
            try {
                fw = new FileWriter(path);
                bw = new BufferedWriter(fw);
                while (true) {
                    s = scanner.nextLine();
                    if (s.equals("exit")) {
                        break;
                    }
                    bw.write(s);
                    bw.newLine();
                }
                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        } else {
            System.out.println("*请先使用touch命令创建文件，然后编辑*");
        }
    }

    // 显示文件内容
    public void readFile(String fileName) {
        String path = DISK_NAME + "\\"+ filePath + "\\" + fileName;
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            FileReader fr = null;
            BufferedReader br = null;

            try {
                fr = new FileReader(path);
                br = new BufferedReader(fr);
                String string;
                while ((string = br.readLine()) != null) {
                    System.out.println(string);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("*..." + fileName + "文件不存在！...*");
        }
    }

}
