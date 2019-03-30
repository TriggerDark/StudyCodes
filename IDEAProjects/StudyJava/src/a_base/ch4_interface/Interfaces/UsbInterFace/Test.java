package base.ch4.Interfaces.UsbInterFace;

public class Test {
    public static void main(String[] args) {
        Usb fan = new UsbFan();
        fan.service();

        Usb disk = new UsbDisk();
        disk.service();
    }
}
