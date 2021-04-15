package Linklist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /*
        *ArrayList manage arrays internally,
        * [0][1][2][3][4][5]........
         */
        List<Integer> arrayList = new ArrayList<Integer>();
        /*
          *LinkedList consist of element where each element
          * has a reference to the previous and next element
          * [0]->[1]->[2]->[3].......
          * <- <-
         */
        List<Integer> linkedList = new LinkedList<Integer>();
        doTiming("Arraylist", arrayList);
        doTiming("Linkedlist", linkedList);

    }
    private  static void doTiming(String type, List<Integer> list){

        for(int i=0;i<1E5; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();
        //adding item anywhere else in the list
        for (int i=0; i<1E5; i++){
            list.add(0, i);
        }
         /*
        //adding item at the end of the list
        for(int i=0; i<1E5; i++){
            list.add(i);
        } */
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " +  (end - start) + "ms for" + type);

    }
}
