package l12_functionalInterface_lambdaExpression;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;

// First interface (Annotation @FunctionalInterface can be used to check if only 1 abstract method exists)
@FunctionalInterface
interface Operations{
    // Method not declared by an access modifier in an interface defaults to an abstract method.
    void Calci(int a, int b);

    // Default access modifier method
    default void limit(){
        System.out.println("Default");
    }
    // Static access modifier method
    static void ranging(){
        System.out.println("Static");
    }
}

// First class implementing the interface
class person1 implements Operations{
    // Annotation Override used to check if a method in the class is overriding a method from an interface or a class.
    @Override
    public void Calci(int a,int b){
        System.out.println("Addition of a + b is: "+(a+b));
    }
}

public class l12_lambda {
    public static void main(String[] args) {
        // Person1 object created
        person1 p1 = new person1();
        p1.Calci(16, 18);

        // Anonymous class created using an existing interface to avoid creation of multiple class.
        Operations o3 = new Operations() {
            public void Calci(int a, int b){
                System.out.println("Multiplied value of a * b is: "+(a*b));
            }
        };
        o3.Calci(5,7);

        // Lambda expression (similar to arrow function in js) used to implement a method from an interface
        Operations p4 = (a,b) -> System.out.println("Division of a / b is: "+(a/b));
        p4.Calci(50,4);
        p4.limit();

        // Creating a lambda expression using a default interface "Consumer", inside the angular braces "<>" we have to mention the type of data the argumnt will be(String, Integer, Double etc). It takes an input and returns nothing (method: void accept)
        Consumer<String> printer = (msg) -> System.out.println(msg);
        printer.accept("HelloJava");

        // Creating a lambda expression using a default interface "Predicate", inside the angular braces "<>" we have to mention the type of data the argumnt will be(String, Integer, Double etc). Returns a boolean value after testing.
        Predicate<Integer> check = (num) -> num > 10;
        System.out.println(check.test(15));

        // Creating a lambda expression using a default interface "Supplier", inside the angular braces "<>" we have to mention the type of data the argumnt will be(String, Integer, Double etc). 
        Supplier<Integer> abcd = () -> 76;
        System.out.println(abcd.get());

        // Creating a lambda expression using a default interface "Function", inside the angular braces "<>" we have to mention the type of data the argumnt will be and the type of data it returns, 2 data types can be same or different.(String, Integer, Double etc). 
        Function<Integer, String> math1 = (num) -> "Result is: "+(num * 5);
        System.out.println(math1.apply(5));
        
    }
}
