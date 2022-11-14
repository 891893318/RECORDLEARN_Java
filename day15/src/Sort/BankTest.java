package Sort;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Thread t1 = new Thread(bank);
        Thread t2 = new Thread(bank);

        t1.setName("线程1 ");
        t2.setName("线程2 ");

        t1.start();
        t2.start();
    }
}

