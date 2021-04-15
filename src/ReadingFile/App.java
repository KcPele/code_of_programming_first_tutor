package ReadingFile;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\userpc\\IdeaProjects\\CaveOfProgramming\\src\\ReadingFile.ReadingFile\\test.txt");
BufferedReader readerBuff = null;
        try {
            FileReader reading = new FileReader(file);
            readerBuff = new BufferedReader(reading);

            String line;

              while ( (line = readerBuff.readLine())!= null ){
                  System.out.println(line);
              }


        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage() + file.toString());
        }catch (IOException e) {
            System.out.println("Unable to read file  " + e.getMessage());
    }
        finally {
            try {
                readerBuff.close();
            } catch (IOException e) {
                System.out.println("cant anable to close file" + file.toString());
            }
            catch (NullPointerException ex){

            }
        }

    }
}
