package senior.ch8_thread.methodDemo;

/**
 * 实现线程休眠
 * @author SuperStar
 */
public class MethodDemo2 {

    public static void bySec(long s) {
        for (int i= 0; i < s; i++) {
            System.out.println(i + 1 + "秒");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException("线程进入休眠状态失败！");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("------主线程开始休眠-------");
        bySec(5);
        System.out.println("------主线程休眠结束-------");
    }
}
