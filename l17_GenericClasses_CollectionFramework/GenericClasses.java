package l17_GenericClasses_CollectionFramework;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

class Box <T,P>{
    private T content;
    private P item;
    // public Box(T content){
    //     this.content = content;
    // }
    public Box(T content,P item){
        this.content = content;
        this.item = item;
    }
    public T getContent(){
        return content;
    }
    public void setContent(T content){
        this.content = content;
    }
    public P getItem(){
        return item;
    }
    public void setItem(P item){
        this.item = item;
    }
}

public class GenericClasses {
    public static void main(String[] args) {
        // Creating an instance of a class which is generic class, has no particular return type and can accept any return type. Notice the presence of diamond operator in the declaration and also the mention of data type in the instance object declaration.
        Box<String,Integer> b1 = new Box<>("Hey",45);
        System.out.println(b1.getContent()+" "+b1.getItem());

        // Creating a second object b2 with a generic class and passing double and boolean values.
        Box <Double,Boolean> b2 = new Box< >(14.5,false);
        System.out.println(b2.getContent()+" "+b2.getItem());

        Printer.printElements(345774, "nothing");

        // Created an array list which is from a collection framework, two imports required. List stores all values including duplicates.
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(45);
        arr1.add(678);
        arr1.add(234);
        System.out.println(arr1);

        // Created a hashSet using Set interface, two imports required. Set is used to only store unique values and ingores duplicates.
        Set<String> arr2 = new HashSet<>();
        arr2.add("Hello");
        arr2.add("Welcome");
        arr2.add("Hi");
        // Duplicate values ignored.
        arr2.add("Hello");
        System.out.println(arr2);

        // Created a hashmap using map interface, two imports required.
        Map<String, Integer> obj1 = new HashMap<>();
        obj1.put("Hi",13);
        obj1.put("Hello",47);
        obj1.put("Good day",456);
        obj1.put("Hi",23);
        System.out.println(obj1);


    }
}
