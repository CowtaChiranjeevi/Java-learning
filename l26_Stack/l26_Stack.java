package l26_Stack;
import java.util.Stack;

public class l26_Stack {
    public static void main(String[] args) {
        // Created a stack using java.util.Stack package which is imported
        Stack<Integer> stk = new Stack<>();
        // Push method adds the element to the top of the stack where after each push the top position still remains 1 but the value chagnes.
        System.out.println(stk.push(1));
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.push(6);
        stk.push(7);
        System.out.println("The stack contains: "+stk);
        // pop method removes one element at the top of the stack (last value) , printing pop prints the element that is removed.
        // stk.pop();
        System.out.println(stk.pop());
        System.out.println(stk);
        // peek method returns the last element value (top of the stack element value) 
        System.out.println(stk.peek());
        // empty method returns a boolean value whether a stack is empty or not
        System.out.println(stk.empty());
        // The search method in stack is unique, it does not find an index position like usual get methods but it shows the position of the first occured element mentioned as the argument from the top of the said stack
        int location = stk.search(4);
        System.out.println(location);
        // size method shows the total number of elements in a stack
        System.out.println(stk.size());
        System.out.println();

        // Iterating using for loop , get() method returns the position at specified index in stack 
        // Iterating the stack in the order of positions in stack
        for(int i = stk.size() - 1; i >= 0; i--){
            System.out.println(stk.get(i));
        }
        System.out.println();
        // Iterating according to usual indexes
        for(int i = 0 ; i < stk.size() - 1 ; i++){
            System.out.println(stk.get(i));
        }
        System.out.println();
        

    }
}
