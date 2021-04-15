package SortedMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> hashmap = new HashMap<Integer, String>();
        Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treemap = new TreeMap<Integer, String>();
          testMap(treemap);
    }

    public  static void testMap(Map<Integer, String> map){
        map.put(9, "fox");
        map.put(8, "cat");
        map.put(7, "dog");
        map.put(6, "fish");
        map.put(15, "lion");
        map.put(4, "dove");
        map.put(3, "monkey");
        map.put(2, "bird");

        for(Integer key: map.keySet()){
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }

    }
}
