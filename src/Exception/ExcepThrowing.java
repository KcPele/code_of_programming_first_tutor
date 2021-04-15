package Exception;

import java.io.IOException;

public class ExcepThrowing {
    public static void main(String[] args) {
        Test tes = new Test();
        try {
            tes.pass();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
