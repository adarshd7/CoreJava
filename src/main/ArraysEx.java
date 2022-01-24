package main;
import java.util.*;
public class ArraysEx {
    public static void main(String[] args) {
        int[] a= new int[5];
        int result;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            System.out.println("enter array elements");
            a[i]=sc.nextInt();

        }
        for (int i=0;i<a.length;i++){
          result=a[i]*2;
          System.out.println(result);

        }
    }
}
