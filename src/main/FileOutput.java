package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.*;

public class FileOutput {
    public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<>();
            names.add("adarsh");
            names.add("venkat");
            names.add("sak");
            names.add("akhil");
            try{
            PrintWriter pw = new PrintWriter("output.txt");
            for (String name : names) {
            pw.println(name);
            }
        }catch(FileNotFoundException ex){
            System.out.println("Can't write to a file");
        }
    }
}