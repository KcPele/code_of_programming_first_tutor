package Serialiation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        System.out.println("Reading object>>>>> ");

        try(FileInputStream fi = new FileInputStream("C:\\Users\\userpc\\Desktop\\fileForJava\\people.bin")){

            ObjectInputStream os = new ObjectInputStream(fi);

            Person person1 = (Person)os.readObject();
            Person person2 = (Person)os.readObject();

            os.close();
            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){

        }
    }
}
