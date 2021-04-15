package TransientKey;

import Serialiation.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        System.out.println("Reading object>>>>>22 ");

        try( ObjectInputStream os = new ObjectInputStream(new FileInputStream("C:\\Users\\userpc\\Desktop\\fileForJava\\people.bin"))){
            Person person = (Person)os.readObject();
            System.out.println(person);



        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){

        }
    }
}
