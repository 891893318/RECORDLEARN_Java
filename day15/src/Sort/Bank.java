package Sort;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 89189
 */
public class Bank implements Runnable{
        double count = 1000;

    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            //方式一
            try {
                lock.lock();
                count += 100;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+"T: "+count);
            }finally {
                lock.unlock();
            }
        //方式二
//            synchronized (this){
//                count += 100;
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println(Thread.currentThread().getName()+"T: "+count);
//            }
        }
    }
}
