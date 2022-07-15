package a13.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main() {
        try {

            //DOMYSLNIE WRITE NADPISUJE TEKST, PISZE OD POCZATKU, A NIE DOPISUJE DO ISTNIEJACEGO!!!

            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file-1.");

            FileWriter myWriter2 = new FileWriter("C:\\Users\\Kamil\\IdeaProjects\\slawek1\\src\\a13\\FileHandling\\filename2.txt");
            myWriter2.write("Files in Java might be tricky, but it is fun enough!");
            myWriter2.close();
            System.out.println("Successfully wrote to the file-2");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
