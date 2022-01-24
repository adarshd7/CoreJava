package main;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(2.0,6.0);
        System.out.println(r1.area());
        Rectangle r2 = new Rectangle();
        r2.setLength(2.0);
        r2.setWidth(10.0);
        System.out.println(r2.area());
    }
}
