package main;
import com.sun.source.util.SourcePositions;

import java.util.*;
public class  Average{

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        double a1;
        double a2;
        double a3;
        a1=sc.nextDouble();
        a2=sc.nextDouble();
        a3=sc.nextDouble();
        double avg = a1+a2+a3/3.0;
        System.out.println("Average "+avg);
    }
}
