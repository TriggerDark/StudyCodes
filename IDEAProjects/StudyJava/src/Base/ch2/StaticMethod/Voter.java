package Base.ch2.StaticMethod;

public class Voter {

    private static int count;
    private static final int MAX_COUNT = 100;
    private String name;

    public Voter() {}
    public Voter(String name) {
        this.name = name;
    }

    //封装
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voteFor() {
        if(count == MAX_COUNT) {
            System.out.println("投票已经结束");
            return;
        }else {
            count ++;
            System.out.println(this.name + ",感谢你投票");
        }
    }

    public static void print(){
        System.out.println("投票总数: " + count);
    }

}
