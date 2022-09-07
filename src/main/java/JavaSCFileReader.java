package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class JavaSCFileReader {
//task 3
    public static void main(String[] args) {
        readFromCommandLine();
    }
    public static void readFromCommandLine() {
        System.out.println("Enter your file name to find it: ");
        Scanner input = new Scanner(System.in);
        String nameOfFile = input.next();
        String text;

        try (BufferedReader in = new BufferedReader(new FileReader(nameOfFile))) {
            System.out.println( "There are comments:");
            while ((text = in.readLine()) != null)
            {
                if (text.startsWith("//"))
                    System.out.println(text);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


