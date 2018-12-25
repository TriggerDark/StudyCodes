package base.ch3.Polymorphism;

class BlackPrinter extends PrinterInfo{

    public BlackPrinter(String brand) {
        super(brand);
    }

    public void print(String context) {
        System.out.println(getBrand() + "黑白打印机" + context);
    }

}
