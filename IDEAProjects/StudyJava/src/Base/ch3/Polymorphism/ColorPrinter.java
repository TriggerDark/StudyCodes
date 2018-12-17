package Base.ch3.Polymorphism;

class ColorPrinter extends PrinterInfo{
    public ColorPrinter(String brand) {
        super(brand);
    }

    public void print(String context) {
        System.out.println(getBrand() + "彩色打印机" + context);
    }
}
