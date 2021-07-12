package com.example.myapp.umeshsir.exceptionpkg;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class FileClass {
    public static void main(String[] args) {

        PrintWriter pw;

        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }

        // providing the checked exception handler


        System.out.println("File saved successfully");

    }

}
