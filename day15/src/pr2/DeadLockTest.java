package pr2;

import static java.lang.Thread.sleep;

class DeadLockTest {
    public static void main(String[] args) {
        //死锁测试
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

            //线程1
        new Thread(() -> {
            //锁1
            synchronized (s1){

                s1.append("aaa");
                s2.append("bbb");
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                //锁2
                synchronized (s2){
                    s2.append("22");
                    s1.append("11");

                    System.out.println(s1);
                    System.out.println(s2);
                }
            }
        }).start();

        //线程2
        new Thread(new Runnable() {
            @Override
            public void run() {
                //锁1
                synchronized (s2){

                    s1.append("ccc");
                    s2.append("ddd");

                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //锁2
                    synchronized (s1){
                        s2.append("33");
                        s1.append("44");

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }).start();

    }
}