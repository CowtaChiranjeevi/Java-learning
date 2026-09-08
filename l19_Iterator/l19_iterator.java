package l19_Iterator;
import java.util.List;
import java.util.ArrayList;
// import java.util.Iterator;
import java.util.ListIterator;

public class l19_iterator {
    public static void main(String[] args) {
        // Created a simple arraylist using List interface and ArrayList class
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Jack fruit");
        fruits.add("Kiwi");
        fruits.add("Watermelon");
        fruits.add("Tomato");

        // Mentioning a number inside listIterator method will make the iterator start from that index number. Works only for forward, not backward.
        ListIterator<String> lit =  fruits.listIterator(1);

        // Forward iterating
        while(lit.hasNext()){
            System.out.println(lit.next());
        }

        System.out.println(" ");

        // Backward. Given a condition to stop printing and stop the cursor in a position after a condition.
        Boolean checklit = lit.hasPrevious();
        while(checklit){
            String val = lit.previous();
            if(val == "Kiwi") checklit = false;
            System.out.println(val);
        }
        System.out.println();

        // Adding elements in between after checking a condition. When a condition is met the value of the element is added right where the cursor is pointed, if its forward then its next and backward if its previous.
        while(lit.hasNext()){
            String fruit = lit.next();
            if(fruit.equals("Watermelon")) lit.add("Orange");
            System.out.println(fruit);
        }
        
        System.out.println(fruits);

        

    }
}
