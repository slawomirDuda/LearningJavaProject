package a13.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main() {
        try {
            //domyslnie tworzy w src jesli nie podam calej sciezki!!
            File myObj = new File("filename.txt");
            File myObj2 = new File("C:\\Users\\Kamil\\IdeaProjects\\slawek1\\src\\a13\\FileHandling\\filename2.txt");
            myObj2.createNewFile();
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
