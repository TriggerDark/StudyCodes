package Base.ch4.Interfaces.Door;

public class TheftProofDoor extends Door implements Lock, TakePhoto {

    @Override
    public void lockUp() {
        System.out.println("插入钥匙，往右转三圈。。。锁门动作。");
    }

    @Override
    public void lockOpen() {
        System.out.println("插入钥匙，往左转三圈。。。开门动作。");
    }

    @Override
    public void open() {
        System.out.println("开门");
    }

    @Override
    public void close() {
        System.out.println("关门");
    }

    @Override
    public void takePhoto() {
        System.out.println("有人来访，已经拍照。。");
    }
}
