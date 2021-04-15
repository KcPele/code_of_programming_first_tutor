package MultiSerialiation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {
    public static void main(String[] args) {
        System.out.println("Reading object>>>>> ");

        try(FileInputStream fi = new FileInputStream("C:\\Users\\userpc\\Desktop\\fileForJava\\people.bin")){

            ObjectInputStream os = new ObjectInputStream(fi);

            Person[] people = (Person[])os.readObject();

            @SuppressWarnings("unchecked")
            ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();
            for(Person person: peopleList){
                System.out.println(person);
            }
            int num = os.readInt();
            for (int i = 0; i < num; i++){
                Person person = (Person) os.readObject();
            }

            //os.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){

        }
        }
}
