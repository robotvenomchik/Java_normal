package Classworks.Classwork17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("data = "+openFile("a.txt"));
    }

    public static String openFile(String path) {

        File myObj = new File(path);
        Scanner myReader = null;
        try {
            myReader = new Scanner(myObj);
        } catch (FileNotFoundException e) {
            try {
                myObj.createNewFile();
                System.out.println("created");
            } catch (IOException ex) {
                System.out.println("cant create");
            }
        }
        return read(myReader);
    }

    private static String read(Scanner myReader) {
        String data = "";
        while (myReader.hasNextLine()) {
            data += myReader.nextLine();

        }
        myReader.close();

        System.out.println("readed.");

        return data;
    }

}
