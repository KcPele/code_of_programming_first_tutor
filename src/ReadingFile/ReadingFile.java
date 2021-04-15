package ReadingFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) throws FileNotFoundException {


        String fileName = "C:\\Users\\userpc\\Desktop\\forJava.txt";
        File textFile = new File(fileName);
        ReadingFile readFile = new ReadingFile();

        Scanner in = new Scanner(textFile);
        int value = in.nextInt();
        System.out.println("Read value" + value);
        in.nextLine();
        int count = 2;
        while(in.hasNext()){
            String line = in.nextLine();
            System.out.println(count + ": " + line);
            count++;
        }

        in.close();

        readFile.readingFile(textFile);

    }
    public void  readingFile(File fileToRead) throws FileNotFoundException{
        Scanner reading = new Scanner(fileToRead);
        reading.nextLine();
 int num = 0;
        while (reading.hasNext()){
            String value = reading.nextLine();
            System.out.println(num + " " + value);
            num++;
        }
        reading.close();
    }
}
