package Base.ch4.Interfaces.UsbInterFace;

public class UsbDisk implements Usb {
    @Override
    public void service() {
        System.out.println("插入光盘看奥特曼");
    }
}
