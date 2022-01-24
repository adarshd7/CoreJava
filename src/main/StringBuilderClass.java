package main;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Adarsh Employee");
        sb.append("cool");
        System.out.println(sb);
        sb.insert(10,"Super");
        System.out.println(sb);
        sb.delete(12,16);
        System.out.println(sb);
    }
}
