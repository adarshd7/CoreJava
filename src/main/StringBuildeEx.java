package main;

import java.util.*;
public class StringBuildeEx {
    public static void main(String[] args) {
        String name1="Adarsh";
        String name2="Adarsh";
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        name=sc.nextLine();
        if(name1.equals(name2)){
            System.out.println("They are equal");
        }
        if(name1.compareTo(name)>0){
            System.out.println("name1 greater than name2");
        }
    }
}
