package l23_HashMap;
import java.util.HashMap;

public class l23_HashMap {
    public static void main(String[] args) {
        //  Created a hashmap using hashmap import and constructor
        HashMap<Integer,String> hmap = new HashMap<>();
        hmap.put(24,"Shreja");
        hmap.put(16,"Nikhitha");
        hmap.put(49,"Divya");
        // when a key matches the value is replaced. Duplicate keys are not allowed but duplicate values are.
        hmap.put(24,"Keerthana");
        System.out.println(hmap);
        // get method in hashmap uses the value of the key and not index values to return the value of that key
        System.out.println(hmap.get(16));
        // if a key does not exist it returns null but not an error.
        System.out.println(hmap.get(18));
    }
}
