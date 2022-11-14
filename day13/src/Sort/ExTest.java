package Sort;

public class ExTest {
    public static void main(String[] args) {
        Ex ex = new Ex();
        Thread thread= new Thread(ex);
        thread.start();
        Thread thread1=new Thread(ex);
        thread1.start();

        for (int i = 0;i<=5;i++) {
            System.out.println(Thread.currentThread().getName()+":1");
        }
    }
}
