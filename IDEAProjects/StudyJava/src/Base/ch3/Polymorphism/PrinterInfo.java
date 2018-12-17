package Base.ch3.Polymorphism;

/*
 * 抽象方法，只包含方法头，没有方法体，可以定义为抽象方法
 * 包含抽象方法的类必须定义为抽象类，抽象类可以不包含任何抽象方法
 * 抽象类是不可以实例化的，抽象类可能有抽象方法，抽象方法是没有方法的，不可以被调用
 * 一旦一个子类继承了抽象类，需要实现抽象类的所有方法
 */

abstract class PrinterInfo{
    private String brand;

    public PrinterInfo(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void print(String context);

}
