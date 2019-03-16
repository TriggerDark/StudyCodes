package exercise.fileSystem;

import java.util.Objects;

public class User {
    private String name;
    private String password;
    //默认用户
    public User(){
        name = "lirongwei";
        password = "123456";
    }
    //只创建用户，设置默认密码
    public User(String name) {
        this.name = name;
        password = "123456";
    }
    //同时设置用户和密码
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

}
