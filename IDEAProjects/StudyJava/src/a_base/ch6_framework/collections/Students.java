package base.ch6.collections;

import base.ch6.map.exercise.Student;

public class Students extends Student implements Comparable<Students> {
    private int number;

    public Students(int number,String name, String sex) {
        super(name, sex);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Students stu) {
        if (this.number == stu.number) {
            return 0;
        } else if (this.number > stu.number) {
            return 1;
        } else {
            return -1;
        }
    }
}
