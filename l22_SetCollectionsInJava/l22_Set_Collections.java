package l22_SetCollectionsInJava;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.NavigableSet;
import java.util.ArrayList;
import java.util.Iterator;

public class l22_Set_Collections {
    public static void main(String[] args) {
        // Created a hashset collection framework using hashset import. Stores only unique values does not maintain insertion order or index. Allows a single null value
        HashSet<String> hashlist = new HashSet<>();
        hashlist.add("John");
        hashlist.add("Kevin");
        hashlist.add("Jacob");
        hashlist.add("John");
        hashlist.add("Ethan");
        // Printing the hashset using for each loop
        for(String i :hashlist){
            System.out.println(i);
        }
        // size() method only shows the number of values of unique elements and ignores the duplicates.
        System.out.println("Size of HashSet is: "+hashlist.size());
        // contains() method checks for the existence of value mentioned, as hashset doesn't maintain insertion order there are no indexes so we must mention the value. Returns a boolean value
        System.out.println("Checking if the set contains the name \"John\" : "+hashlist.contains("John"));
        // remove() method removes the existence of an element. Also removes the duplicate values inserted in the hashset.
        hashlist.remove("John");
        System.out.println(hashlist);
        // clear() method removes all the elements inside a hashset.
        hashlist.clear();
        System.out.println(hashlist);

        // Creating a linkedhashset , which is a hashset but it maintains insertion order. Still cannot be accessed by indices.
        LinkedHashSet<Integer> list01 = new LinkedHashSet<>();
        list01.add(45);
        list01.add(35);
        list01.add(58);
        list01.add(8);
        list01.add(14);
        list01.add(28);
        list01.add(45);
        System.out.println(list01);
        // Printing the linkedhashset using for each loop
        for(int i :list01){
            System.out.println(i);
        }
        // size() method only shows the number of values of unique elements and ignores the duplicates.
        System.out.println("Size of HashSet is: "+list01.size());
        // contains() method checks for the existence of value mentioned
        System.out.println("Checking if the set contains the integer \"15\" : "+list01.contains(50));
        // remove() method removes the existence of an element. Also removes the duplicate values inserted in the hashset.
        list01.remove(35);
        System.out.println(list01);
        // clear() method removes all the elements inside a hashset.
        // list01.clear();
        System.out.println(list01);
        // Traversing through a linkedhashset using iterator
        Iterator<Integer> listIt = list01.iterator();
        while(listIt.hasNext()){
            int i = listIt.next();
            System.out.println(i);
        }

        // Creatng a TreeSet which maintains natural order(ascending , alphabetical) by default no matter when or where the elements are inserted. Does not allow null values at all unlike hashset or linkedhashset
        NavigableSet<String> tslist01 = new TreeSet<>();
        tslist01.add("47");
        tslist01.add("47");
        tslist01.add("58");
        tslist01.add("33");
        tslist01.add("22");
        tslist01.add("98");
        tslist01.add("14");
        // Prints in ascending order although they are strings, also removes duplicates and essentially maintains natural order
        System.out.println(tslist01);
        // Besides the common methods from both hashset and linkedhashset it also has some additional methods.
        System.out.println(tslist01.first());
        System.out.println(tslist01.last());
        System.out.println(tslist01.lower("40"));
        System.out.println(tslist01.higher("40"));

        NavigableSet<String> tslist02 = new TreeSet<>();
        tslist02.add("Red");
        tslist02.add("Blue");
        tslist02.add("Green");
        tslist02.add("Yellow");
        tslist02.add("Indigo");
        tslist02.add("Pink");
        tslist02.add("Orange");

        NavigableSet<String> tslist03 = new TreeSet<>();
        tslist03.add("Maroon");
        tslist03.add("Cyan");
        tslist03.add("Turquiose");
        tslist03.add("Teal");
        tslist03.add("Indigo");
        tslist03.add("Pink");
        tslist03.add("Orange");

        // Two treesets are added into one treesets where it only adds the unique values and ignores the duplicates.
        // tslist02.addAll(tslist03);
        // System.out.println(tslist02);

        // retainAll() method only brings the common values between both the treesets and removes duplicates in the first tree set
        // tslist02.retainAll(tslist03);
        // System.out.println(tslist02);

        // containsAll() method checks if all the values in the argument treeset exists in the treeset
        System.out.println(tslist02.containsAll(tslist03));

        // removeAll() method is used to remove common values between sets and only print unique values of the first treeset
        tslist02.removeAll(tslist03);
        System.out.println(tslist02);

        // converting a treeset into an arraylist using constructor
        ArrayList<String> alist01 = new ArrayList<>(tslist02);
        System.out.println(alist01);


    }
}
