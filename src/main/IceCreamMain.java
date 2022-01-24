package main;

public class IceCreamMain {
    public static void main(String[] args) {
        IceCream i1 =new IceCream("chocolate",100,3);
        i1.addTopping("vanilla");
        System.out.println(i1.getName());
        System.out.println(i1.getCost());
        System.out.println(i1.getNumScoops());
        i1.printToppings();
    }
}
