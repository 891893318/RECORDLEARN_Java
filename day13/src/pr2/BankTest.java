package pr2;

public class BankTest {
    public static void main(String[] args) {
        Bank em =new Bank();
        Thread thread = new Thread(em);
        thread.start();
        Bank em1 = new Bank();
        Thread thread1 =new Thread(em1);
        thread1.start();
    }
}
