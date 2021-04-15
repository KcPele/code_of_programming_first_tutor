package Userinput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        UserInput user = new UserInput();
        // user.userInput();
        user.doWhile();
        //user.forSwitch();

    }

    public void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line text pleace: ");
        String line = input.nextLine();
        System.out.println("you enter: " + line);

    }

    public void doWhile() {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("Enter a number: ");
        int value = scanner.nextInt();
        while (value != 5){
            System.out.print("Enter a number: ");
            value = scanner.nextInt();
        } */
        int value = 0;
        do {
            System.out.print("Enter a number: ");
            value = scanner.nextInt();
        } while (value != 5);
        System.out.println("Go 5!");
    }

    public void forSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a cmmand: ");
        String text = scanner.nextLine();

        switch (text.toLowerCase()) {
            case "start":
                System.out.println("Inheritance.Machine stated");
                Scanner input = new Scanner(System.in);

                String value = null;
                String stop = "stop";
                do {
                    System.out.println("enter a number: ");
                    value = input.nextLine();
                    System.out.println(value.equals("stop"));

                } while (value != stop);
                break;
            case "stop":
                System.out.println("Inheritance.Machine stoted");
            default:
                System.out.println("command not recognised");
        }


    }
}