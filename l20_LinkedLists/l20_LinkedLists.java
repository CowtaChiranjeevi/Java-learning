package l20_LinkedLists;
import java.util.LinkedList;

public class l20_LinkedLists {
    public static void main(String[] args) {
        // LinkedList created using LinkedList class , import required. There are different methods in LinkedList like add, addFirst, addLast, removeFirst, removeLast, getFirst, getLast, get.
        LinkedList<String> bikes = new LinkedList<String>();
        bikes.add("Honda");
        bikes.add("Suzuki");
        bikes.add("Triumph");
        bikes.add("Bajaj");

        System.out.println(bikes);

        bikes.addFirst("Royal Enfield");
        System.out.println(bikes);

        bikes.addLast("Ducati");
        System.out.println(bikes);

        bikes.removeFirst();
        System.out.println(bikes);

        bikes.removeLast();
        System.out.println(bikes);

        System.out.println(bikes.getFirst());
        System.out.println(bikes.getLast());
        System.out.println(bikes.get(2));

        // Iteraing over a LinkedList using for loop
        for(int i=0;i<bikes.size();i++){
            System.out.print(" "+bikes.get(i));
        }
        System.out.println();
        // Iterating over a LinkedList using for each loop
        for(String bike : bikes){
            System.out.print(bike+" ");
        }

    }
}
