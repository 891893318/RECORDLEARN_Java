package pr2;

import static java.lang.Thread.sleep;

class Store {


    static double goods = 0;

    synchronized void consumeGoods() throws InterruptedException {

        if (goods>0){
            System.out.println(Thread.currentThread().getName()+ "开始消费第" + goods +"商品");
            goods--;
            notify();
        }else {
            wait();
        }
    }

    synchronized void  conductGoods() throws InterruptedException {

        if (goods<30){
            goods++;
            System.out.println(Thread.currentThread().getName()+"开始生产第" + goods+ "商品");
            notify();
        }else {
            wait();
        }
    }
}

class Consumer implements Runnable{
    private final Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" 开始消费");

        while (true) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                store.consumeGoods();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Productor implements Runnable{
    private final Store store;

    public Productor(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 开始生产");
        while (true) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                store.conductGoods();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        Consumer consumer =new Consumer(store);
        Thread thread1 = new Thread(consumer);
        Productor productor = new Productor(store);
        Thread thread2 = new Thread(productor);

        thread1.setName("消费者");
        thread2.setName("生产者");

        thread1.start();
        thread2.start();
    }
}
