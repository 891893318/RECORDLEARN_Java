package pr2;

public class Bank implements Runnable{
    double money = 1000;

    public void less(){
        money -= money * (0.05);
    }

    public void add(){
        money += money *0.05;
    }
    @Override
    public void run() {
        System.out.println("当前salery：" + money);
    }
}
