package Base.ch4.Interfaces.Phone;

public abstract class Handset {
    private String Brand;
    private String type;

    public Handset(){}

    public Handset(String Brand, String type){
        this.Brand = Brand;
        this.type = type;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return Brand;
    }

    public String getType() {
        return type;
    }

    //手机信息
    public void showInfo(){
        System.out.println("这是一台" + Brand);
    }

    //收发短信
    public abstract void sendMessage();
    //打电话
    public abstract void call();
}
