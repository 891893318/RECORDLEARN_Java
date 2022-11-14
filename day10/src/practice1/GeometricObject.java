package practice1;

import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private boolean fiiled;
    private java.util.Date dateCreated;

    protected GeometricObject(){
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean fiiled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.fiiled = fiiled;
    }

    public String getColor(){
        return color;
    }

    public boolean isFiiled() {
        return fiiled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFiiled(boolean fiiled) {
        this.fiiled = fiiled;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimrter();
}
