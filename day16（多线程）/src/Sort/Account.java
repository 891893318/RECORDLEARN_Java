package Sort;


public class Account implements Runnable {
    double account = 0;

    public synchronized void addAccount(double add) throws InterruptedException {
        if(add>0){
            account += add;
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName() + " 余额 " + account);
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                addAccount(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }

        }
    }
}
