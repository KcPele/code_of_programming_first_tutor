package Generics;

import java.util.ArrayList;
import java.util.HashMap;

public class UseGenerics {
    public static void main(String[] args) {
        //////// before java 5 ////////
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(1);
        System.out.println(fruit);
        /////////modern style ////////
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Dogs");
        strings.add("bravo");
for (String string: strings){
    System.out.println(string);
}


        HashMap<Integer, String> map = new HashMap<Integer, String>();



    }
}
