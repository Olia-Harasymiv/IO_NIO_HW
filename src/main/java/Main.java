package main.java;

import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        writeToFile();
        readFromFile();
        writeToFileCharStream();

    }
    public static void writeToFile() throws Exception {
        OutputStream outputStream = new FileOutputStream("text.txt", true);
        String text = "hello";
        outputStream.write(text.getBytes());
        outputStream.close();
    }
    public static void readFromFile() throws Exception {
        InputStream inputStream = new FileInputStream("text.txt");
        byte[] byteArray = inputStream.readAllBytes();
        String textInput = new String(byteArray);
        inputStream.close();
        System.out.println ("From file we get:"+ textInput);
    }
    public static void writeToFileCharStream ()throws Exception {
        Writer writer = new FileWriter("text2.txt");
        String s = "some text";
        writer.write (s);
        writer.close();
    }

}
