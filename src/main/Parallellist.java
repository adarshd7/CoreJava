package main;
import java.util.*;
public class Parallellist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int age;
        ArrayList<String> names= new ArrayList<>();
        ArrayList<Integer> ages= new ArrayList<>();
        for (int i=0;i<1;i++){
            System.out.println("Enter name and age");
            name =sc.nextLine();
            System.out.println("Enter age");
            age =sc.nextInt();
            names.add(name);
            ages.add(age);

        }
        for (int i=0;i<names.size();i++){
            System.out.println("name and age are"+names.get(i)+ages.get(i));

        }

     }
}
