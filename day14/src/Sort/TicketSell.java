package Sort;

public class TicketSell implements Runnable {

    int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket > 0) {
                    System.out.println("窗口：" + Thread.currentThread().getName() + "当前票号：" + ticket + " 剩余票数：" + (ticket - 1));
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
