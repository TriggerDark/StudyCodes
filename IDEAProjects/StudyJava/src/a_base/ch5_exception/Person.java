package base.ch5;

/**
 *          throw                       throws
 *         生成并抛出异常              声明方法内抛出了异常
 * 位于方法体内部，可作为单独语句使用     必须跟在方法参数列表后面，不能单独使用
 * 抛出一个异常对象，且只能是一个         声明抛出异常类型，可以跟多个异常
 */

public class Person {
    private String name;
    private int age;
    private String sex;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) throws Exception {
        if (age <= 120 && age >= 0)
            this.age = age;
        else
            throw new Exception("年龄必须在0~120之间");
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) throws GenderException {
        if (sex.equals("男")||sex.equals("女"))
            this.sex = sex;
        else
            throw new GenderException("性别必须为男或女");
    }

    public String getSex(){
        return sex;
    }

    public void print(){
        System.out.println(this.getName() + "-" + this.getSex() + "-" + this.getAge());
    }

    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setSex("boy");
            //person.setAge(250);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}