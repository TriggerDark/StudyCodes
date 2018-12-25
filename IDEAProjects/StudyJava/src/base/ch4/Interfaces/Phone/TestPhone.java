package Base.ch4.Interfaces.Phone;

public class TestPhone {
    public static void main(String[] args) {
        CommonPhone commonPhone = new CommonPhone("诺基亚", "666");
        commonPhone.call();
        commonPhone.sendMessage();
        commonPhone.playVideo("南山南");
        commonPhone.showInfo();

        IntellectPhone intellectPhone = new IntellectPhone("Apple", "6s");
        intellectPhone.call();
        intellectPhone.sendMessage();
        intellectPhone.playVideo("琅琊榜");
        intellectPhone.netWorking();
        intellectPhone.takePhotos();
        intellectPhone.showInfo();
    }
}
