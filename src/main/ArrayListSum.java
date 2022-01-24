package main;

import java.util.*;
public class ArrayListSum {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(24);
        list.add(20);
        int sum=SumofElements(list);
        System.out.println("Sum is "+sum);
    }
    public static int SumofElements(ArrayList<Integer> lis)
    {
        int s=0;
        for(int i=0;i<lis.size();i++)
        {
            s=s+lis.get(i);
        }
        return s;
    }
}
