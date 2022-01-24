package main;

public class Rectangle {
    private double length;
    private double width;
    Rectangle(){
        this(1.0,1.0);
    }
    Rectangle(double l,double w){
        this.length=l;
        this.width=w;
    }
    public void setLength(double l){
        this.length=l;
    }
    public void setWidth(double w){
        this.width=w;
    }
    public  double area(){
        return length*width;
    }
}
