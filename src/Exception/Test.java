package Exception;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public void pass()throws IOException{
        int value = 0;

        if (value != 0){
            throw new IOException("Could not connect to server");

        }
        System.out.println("we are conducting a test");
    }

}
