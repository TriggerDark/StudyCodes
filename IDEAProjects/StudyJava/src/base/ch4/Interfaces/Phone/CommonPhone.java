package base.ch4.Interfaces.Phone;

public class CommonPhone extends Handset implements Playing {

    public CommonPhone(){}

    public CommonPhone(String brand, String type){
        super(brand, type);
    }

    @Override
    public void playVideo(String name) {
        System.out.println("播放音频《" + name + "》");
    }

    @Override
    public void sendMessage() {
        System.out.println("发送短信");
    }

    @Override
    public void call() {
        System.out.println("打电话");
    }
}
