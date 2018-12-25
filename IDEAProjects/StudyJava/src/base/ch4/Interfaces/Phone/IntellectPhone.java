package Base.ch4.Interfaces.Phone;

public class IntellectPhone extends Handset implements TakePhoto, Playing, NetWorking {
    public IntellectPhone(){}

    public IntellectPhone(String brand, String type){
        super(brand, type);
    }

    @Override
    public void call() {
        System.out.println("视频电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("发送文字+图片+视频信息");
    }

    @Override
    public void playVideo(String name) {
        System.out.println("播放视频《" + name + "》");
    }

    @Override
    public void netWorking() {
        System.out.println("可以联网");
    }

    @Override
    public void takePhotos() {
        System.out.println("可以拍照");
    }
}
