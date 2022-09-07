package main.java;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //ByteWriteToFile();
        ByteReadFromFile();
        //CharWriteToFile();
        CharReadFromFile();
    }
    public static void ByteWriteToFile() {
        try (OutputStream outputStream = new FileOutputStream("text1.txt")) {
            String test = "qwerty";
            outputStream.write(test.getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void ByteReadFromFile() {
        try (InputStream inputStream = new FileInputStream("text1.txt")) {
            byte[] bytes = inputStream.readAllBytes();
            String string = new String(bytes);
            System.out.println("Data from file 1: " + string);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void CharWriteToFile(){
        try (Writer writer = new FileWriter("text2.txt")){
            String text = "123456qwerty";
            writer.write(text);
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public static void CharReadFromFile(){
        try(Reader reader = new FileReader("text2.txt")) {
            int data = reader.read();
            String s = "";
            while(data != -1){
                char dataChar = (char) data;
                s = s + dataChar;
                data = reader.read();
            }
            System.out.println("Data from file 2: " + s);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

