package l25_LinkedHashMap_TreeMap;

import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;

public class l25_LinkedHashMap_TreeMap {
    public static void main(String[] args) {
        // Created a linkedhashmap using an import from util
        LinkedHashMap<String,String> lhm = new LinkedHashMap<>();
        // put method adds key value pairs in the same data type mentioned in the declaration
        lhm.put("Vishal","Andhra");
        lhm.put("Manoj","Bajpayee");
        lhm.put("Boss","Megastar");
        lhm.put("Waiter","Served");
        lhm.put("Dmart","Value");
        lhm.put("Moon","Satellite");
        lhm.put(null,"Hello");
        System.out.println(lhm);

        // Operations in linkedhashmap
        System.out.println(lhm.get("Vishal"));
        System.out.println(lhm.keySet());
        System.out.println(lhm.values());
        System.out.println(lhm.size());
        System.out.println(lhm.entrySet());
        System.out.println(lhm.replace("Boss","Adipurush"));
        // lhm.clear();
        System.out.println();

        // Iterating through a linkedhashmap using iterator
        Iterator<Map.Entry<String,String>> lhmit = lhm.entrySet().iterator();
        while(lhmit.hasNext()){
            Map.Entry<String,String> line = lhmit.next();
            System.out.println(line.getKey()+" "+line.getValue());
        }

        // Creating a treemap object using import. Has natural sorting (ascending, alphabetical)
        TreeMap<Integer,Integer> marks = new TreeMap<>();
        marks.put(1,38);
        marks.put(2,29);
        marks.put(3,34);
        marks.put(4,13);
        marks.put(5, null);
        marks.put(6, 30);
        marks.put(7,40);
        marks.put(8,37);
        System.out.println(marks);

        // Operations in treemap
        System.out.println(marks.get(4));
        System.out.println(marks.keySet());
        System.out.println(marks.values());
        System.out.println(marks.size());
        System.out.println(marks.entrySet());
        System.out.println(marks.replace(4,16));
        // marks.clear();
        System.out.println();


    }
}
