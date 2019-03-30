package base.ch2.CreateClass;

/**
 * 实现学院信息管理
 */

public class StudentsInfo {
    String[] names = new String[30];//学员姓名数组
    //添加学员姓名
    public void addName(String name){
        for (int i = 0; i < names.length; i++){
            if(names[i] == null){
                names[i] = name;
                break;
            }
        }
    }

    //在一定区域内查找某个学生
    //start开始查找位置，end结束查找位置，查找学生姓名name
    public Boolean searchName(int start, int end, String name){
        boolean flag = false;//标记

        for (int i = start; i < end; i++){
            if(names[i].equals(name)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    //显示学员姓名
    public void showName(){
        System.out.println("学员列表：");
        for(int i = 0; i < names.length; i++){
            if(names[i] != null){
                System.out.println(names[i]);
            }
        }
    }

}
