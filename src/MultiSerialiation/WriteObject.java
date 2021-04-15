package MultiSerialiation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObject {
    public static void main(String[] args) {
        System.out.println("Writing Object>>");

        Person[] people = {new Person(1, "Sue"), new Person(2, "Mike"), new Person(3, "john")};

        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
        try(FileOutputStream fs = new FileOutputStream("C:\\Users\\userpc\\Desktop\\fileForJava\\people.bin");  ObjectOutputStream os = new ObjectOutputStream(fs)){


            os.writeObject(people);

            os.writeObject(peopleList);

            os.writeInt(peopleList.size());
            for (Person person: peopleList){
                System.out.println(person);
            }

            //os.close();

        }catch (FileNotFoundException e){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
