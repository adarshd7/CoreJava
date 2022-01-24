package main;

import java.util.*;

public class StringBuilder2 {
    public static void main(String[] args) {
        String myName="James Bond";
        System.out.println("UpperCase"+myName.toUpperCase());
        System.out.println("LowerCase"+myName.toLowerCase());
        int myIndex=myName.indexOf("B");
        System.out.println(myIndex);
        System.out.println(myName.substring(myIndex));
    }
}
