package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
    public static void main(String[] args) {
        File file = new File("test.txt");
         String reading = null;
        try {
            FileReader readingFile = new FileReader(file);


        } catch (FileNotFoundException e){
            System.out.println("fie not found" + e + file.toString());
        } finally {
            System.out.println("finished ");
        }

    }
}
