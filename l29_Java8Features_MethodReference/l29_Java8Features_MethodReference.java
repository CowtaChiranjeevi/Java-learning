package l29_Java8Features_MethodReference;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.Optional;

// Created a class with a static method which is used by a lambda expression and method reference 
class Demo{
    Demo(String msg){
        System.out.println("Hello "+msg);
    }

    public static void start(String word){
        System.out.println(word);
    }
    public void display(String hi){
        System.out.println("This is an instance method");
    }
}

class  l29_Java8Features_MethodReference{
    public static void main(String[] args){
        // Replacing the method of a functional interface Consumer using anonymous class
        // Consumer<String> word = new Consumer<>(){
        //     @Override
        //     public void accept(String word){
        //         System.out.println(word);
        //     }
        // };

        // Using a lambda expression to replace the method in a functional interface
        // Consumer<String> result = (msg) -> System.out.println(msg);

        // Method reference using double colon operator replaces the need for lambda expression and makes writing code simpler.
        // Consumer<String> result = (msg) -> Demo.start(msg);
        Consumer<String> result = Demo::start;
        result.accept("Hi");

        // Created a new object d1 to use an instance method display
        // Demo d1 = new Demo();
        // Consumer<String> result2 = d1::display;
        // result2.accept("Hi");

        Consumer<String> result3 = Demo::new;
        result3.accept("Bro");

        // Optional 
        // Optional wrapper class object has few ways to create which includes of, empty, ofNullable
        Optional<String> name = Optional.of("India");
        Optional<String> empt = Optional.empty();
        Optional<String> nully = Optional.ofNullable(null);

        // Optional objects can be reassigned
        name = Optional.of("Hiii");
        nully = Optional.empty();

        System.out.println(name.isPresent() ? name.get() : "No Value");

        // Optional objects have few key methods like get, isPresent 
        System.out.println(name.get());
        // isPresent displays false for both empty values and also null and true for presence of any value
        System.out.println(empt.isPresent());
        System.out.println(nully);

        // orElse method is used to check the presence of a value and if not a replacement value is mentioned
        String res = nully.orElse("Okay");
        System.out.println(res);




    }
}