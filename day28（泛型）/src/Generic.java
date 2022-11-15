public class Generic<E> {
    private int No1;
    private double No2;
    private E No3;

    public int getNo1(){
        return No1;
    }

    public void setNo1(int no1) {
        this.No1 = no1;
    }

    public void setNo2(double no2) {
        this.No2 = no2;
    }

    public void setNo3(E no3) {
        this.No3 = no3;
    }

    public double getNo2(){
        return No2;
    }

    public E getNo3(){
        return No3;
    }
    public Generic(){}

    public Generic(int no1, double no2, E no3) {
        this.No1 = no1;
        this.No2 = no2;
        this.No3 = no3;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "No1=" + No1 +
                ", No2=" + No2 +
                ", No3=" + No3 +
                '}';
    }
}
