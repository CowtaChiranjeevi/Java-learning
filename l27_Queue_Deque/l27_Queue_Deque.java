package l27_Queue_Deque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class l27_Queue_Deque {
    public static void main(String[] args) {
        // Queue is an interface and needs to be imported by a class, LinkedList class is used to import Queue in this instance
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.offer(6);
        System.out.println(q);

        System.out.println(q.peek());

        // Iterating through queue using for each loop
        for(int i: q){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i: q){
            System.out.println(i+" ");
        }

        // Created a deque which lets you add elements both in the front and rear and remove elements in the front and rear.
        Deque<String> q2 = new ArrayDeque<>();
        // Deque methods 
        q2.add("Grapes");
        q2.addFirst("Apple");
        q2.addLast("Mango");
        q2.add("Pomogrenade");
        System.out.println(q2);
        q2.removeLast();
        System.out.println(q2);
        System.out.println(q2.removeFirst());
        System.out.println(q2.peekFirst());
        System.out.println(q2.peekLast());
        q2.push("Banana");
        q2.push("Tomato");
        q2.pop();
        System.out.println(q2);
    }
}
