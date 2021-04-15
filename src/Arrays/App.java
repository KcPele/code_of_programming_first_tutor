package Arrays;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
    //adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);
        System.out.println(numbers.get(0));

        //indexed for loop iteration
        for(int i=0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        numbers.remove(numbers.size() -1);
        numbers.remove(0);
        for (Integer value: numbers){
            System.out.println(value);
        }
        //removing item carefully

    }
}
