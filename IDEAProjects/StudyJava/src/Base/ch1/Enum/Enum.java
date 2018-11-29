package Base.ch1.Enum;


enum Week {
    Friday, Saturday, Sunday, Monday, Tuesday, Wednesday, Thursday
}

public class Enum {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for (Week ele: weeks)
            System.out.println(ele);
    }
}
