package TryWithResources;

import java.io.*;

public class App2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\userpc\\Desktop\\dad 2.docxd");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;
            line = bufferedReader.readLine();
            while ( line != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("cant find file" + e.getMessage());
        } catch (IOException e) {
            System.out.println("unable to read the file" + file.toString());
        }
    }
}
