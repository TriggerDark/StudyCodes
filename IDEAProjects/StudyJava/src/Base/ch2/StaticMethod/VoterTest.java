package Base.ch2.StaticMethod;

public class VoterTest {
    public static void main(String[] args) {
        Voter v1 = new Voter("张三");
        v1.voteFor();
        Voter v2 = new Voter("李四");
        v2.voteFor();
        Voter.print();
        for (int i = 3; i <= 100; i++){
            Voter v = new Voter("v" + i);
            v.voteFor();
        }
        Voter.print();
        Voter v3 = new Voter("李四");
        v3.voteFor();
        Voter.print();
    }
}
