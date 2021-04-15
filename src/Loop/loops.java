package Loop;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("guess the number: ");
        int guess = scanner.nextInt();
        int secret = 10;
        int secrets = 5;
        while (secrets != guess){
            if (secrets == guess){
                System.out.println("you got it");
                break;
            }
            System.out.print("guess the number: ");
            secret--;
        }

    }
}
