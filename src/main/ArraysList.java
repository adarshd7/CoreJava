package main;

import java.util.*;

public class ArraysList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> myList=new ArrayList<Integer>();
        int input;
        System.out.println("Enter a number that is greater than 0"+"-1 to exit");
        input=sc.nextInt();
        while(input>=0){
            myList.add(input);
            System.out.println("Enter a number that is greater than 0"+"-1 to exit");
            input=sc.nextInt();
        }
        for(int i=myList.size()-1;i>=0;i--){
            System.out.println(myList.get(i));
        }
    }
}
