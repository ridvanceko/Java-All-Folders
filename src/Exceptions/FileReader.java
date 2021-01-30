package Exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {

        // String str = "12";

        int num = Integer.parseInt("12");
        FileInputStream file =null;
        System.out.println(System.getProperty("user.dir"));

        try{
            file = new FileInputStream("Text.txt");
            Scanner scan  = new Scanner(file);
            System.out.println(scan.nextLine());

        } catch (IOException io) {
            System.out.println("IO Exception");
        }
    }
}
