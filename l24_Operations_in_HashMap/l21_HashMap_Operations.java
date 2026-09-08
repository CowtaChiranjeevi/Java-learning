package l24_Operations_in_HashMap;

import java.util.HashMap;
import java.util.Map;

public class l21_HashMap_Operations {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<>();
        hmap.put(24,"Shreja");
        hmap.put(16,"Nikhitha");
        hmap.put(49,"Divya");
        hmap.put(36,"Padma");
        hmap.put(47,"Pooja");
        hmap.put(33,"Amulya");
        System.out.println(hmap);
        // returns all the entries inside an array
        System.out.println(hmap.entrySet());
        // returns the number of unique keys inside the hashmap
        System.out.println(hmap.size());
        // returns all the keys
        System.out.println(hmap.keySet());
        // returns all the values of the keys
        System.out.println(hmap.values());
        // checks if a value exists inside the hashmap
        System.out.println(hmap.containsValue("Chiranjeevi"));
        // checks if a key exists inside the hashmap
        System.out.println(hmap.containsKey(49));
        // removes a specific entry by mentioning its key. Printing it shows the removed value
        System.out.println(hmap.remove(24));
        System.out.println(hmap);
        // hmap.clear();
        //replaces the value of a key by mentioning the key and value as arguments. Printing it shows the replaced value
        System.out.println(hmap.replace(33,"Kavya"));
        System.out.println(hmap);

        // Iterating through hashmap by using for each loop. method .keySet() or .values is necessary to be accessible as a string,else it becomes an expression and would not be able to give as an iterable value
        for(Integer each : hmap.keySet()){
            System.out.print(each+" ");
        }
        System.out.println();

        // Iterating through both key and value
        for(Map.Entry<Integer,String> each : hmap.entrySet()){
            System.out.print(each.getKey()+" "+each.getValue()+" ");
        }


    }   
}
