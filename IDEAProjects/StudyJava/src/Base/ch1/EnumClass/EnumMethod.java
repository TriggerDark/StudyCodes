package Base.ch1.EnumClass;


enum Week {
    Friday, Saturday, Sunday, Monday, Tuesday, Wednesday, Thursday
}

public class EnumMethod {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for (Week ele: weeks)
            System.out.println(ele);
    }
}
