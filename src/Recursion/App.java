package Recursion;

public class App {
    public static void main(String[] args) {

        System.out.println(calculate(4));
    }
    private static int calculate(int value){
        System.out.println( value);
        if (value == 1){
            return 1;
        }
       return calculate(value - 1) * value;

    }
}
