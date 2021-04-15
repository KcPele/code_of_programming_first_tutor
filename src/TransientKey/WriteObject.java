package TransientKey;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        System.out.println("Writing Object>>");


        try( ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\userpc\\Desktop\\fileForJava\\people.bin"))){
            Person person = new Person(7, "fide");

            Person.setCount(88);

            os.writeObject(person);

        }catch (FileNotFoundException e){
e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
