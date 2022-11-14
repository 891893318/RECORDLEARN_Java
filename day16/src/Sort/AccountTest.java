package Sort;

class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Thread t1 =new Thread(account);
        Thread t2 =new Thread(account);
        t1.start();
        t2.start();

    }
}


