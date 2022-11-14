package Sort;

public class TicketSellTest {
    public static void main(String[] args) {
        TicketSell w = new TicketSell();

        Thread window1 = new Thread(w);
        Thread window2 = new Thread(w);
        Thread window3 = new Thread(w);

        window1.setName("窗口1 ");
        window2.setName("窗口2 ");
        window3.setName("窗口3 ");

        window1.start();
        window2.start();
        window3.start();
    }
}
