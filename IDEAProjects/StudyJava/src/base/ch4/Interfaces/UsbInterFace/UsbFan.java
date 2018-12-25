package Base.ch4.Interfaces.UsbInterFace;

public class UsbFan implements Usb {
    @Override
    public void service() {
        System.out.println("打开风扇风扇");
    }
}
