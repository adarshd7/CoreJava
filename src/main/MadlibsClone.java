package main;
import java.util.*;
public class MadlibsClone {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String adj1;
        String name1;
        String occ1;
        String adj2;
        String name2;
        String occ2;
        System.out.println("Enter an adjective");
        adj1=sc.nextLine();
        System.out.println("Enter the name");
        name1=sc.nextLine();
        System.out.println("Enter the Occupation");
        occ1=sc.nextLine();
        System.out.println("Enter an adjective");
        adj2=sc.nextLine();
        System.out.println("Enter the name");
        name2=sc.nextLine();
        System.out.println("Enter the Occupation");
        occ2=sc.nextLine();
        System.out.println("The person who is "+adj1+"  is working at "+occ1+"name is"+name1);
        System.out.println("The person who is "+adj2+"  is working at "+occ2+"name is"+name2);
    }
}
