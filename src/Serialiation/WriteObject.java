package Serialiation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        System.out.println("Writing Object>>");
        Person mike = new Person(23,"mike");
        Person sue = new Person(334, "sue");


        System.out.println(mike);
        System.out.println(sue);
        try(FileOutputStream fs = new FileOutputStream("C:\\Users\\userpc\\Desktop\\fileForJava\\people.bin")){
            ObjectOutputStream os = new ObjectOutputStream(fs);


            os.writeObject(mike);
            os.writeObject(sue);

            os.close();

        }catch (FileNotFoundException e){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
