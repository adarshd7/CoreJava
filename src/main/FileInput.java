package main;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;
import java.io.File;

public class FileInput {
    public static void main(String[] args) {

        Scanner infile;
        try {
            infile = new Scanner(new File("input.txt"));
            int input;
            int sum = 0;
            while (infile.hasNext()) {
                input = infile.nextInt();
                sum=sum+input;
                System.out.println(input);

            }
            System.out.println("Sum is"+sum);
        } catch (FileNotFoundException ex) {
            System.out.println("Can't Found File");
            System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("Error Reading Input");
        }
    }
}