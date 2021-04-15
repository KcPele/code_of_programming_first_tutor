package WritingFile;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\userpc\\Desktop\\test.txt");
        try (BufferedWriter writerBuff = new BufferedWriter(new FileWriter(file))){
            writerBuff.write("this is a new line\n");
            writerBuff.write("the second line is here");
            writerBuff.newLine();
            writerBuff.write("last line oo");

        } catch (IOException e) {
            System.out.println("Exception error oo " + e.toString());
        }
    }
}
