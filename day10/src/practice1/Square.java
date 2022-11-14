package practice1;

public class Square extends GeometricObject implements Colorable {

    private double side;

    public Square(){}

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean fiiled, double side) {
        super(color, fiiled);
        this.side = side;
    }

    public Square(double side, boolean fiiled) {
        this.setFiiled(fiiled);
        this.setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor(){
        System.out.println("给四条边着色");
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getPerimrter() {
        return getSide() * 4;
    }
}
