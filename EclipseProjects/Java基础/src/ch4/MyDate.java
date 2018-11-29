package ch4;
public class MyDate {
    private int day;
    private int month;
    private int year;
    
    // 构造方法的重载
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public MyDate(MyDate date) {
        this.day   = date.day;
        this.month = date.month;
        this.year  = date.year;
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        this.day = day;
    }
    
    public String toString() {
        return "" + day + "-" + month + "-" + year;
    }
    
    public static void main(String[] args) {
    	MyDate md1 = new MyDate(28,2,2013);
    	MyDate md2 = new MyDate(md1);
    }
}
