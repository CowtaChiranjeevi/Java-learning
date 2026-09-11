package l9_Polymorphism;

class Calculator {
    // Different number of parameters
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    // Different type of parameters
    double add(double a, double b) {
        return a + b;
    }
    // Different order of parameters
    double add(int a, double b) {
        return a + b;
    }
    double add(double a, int b) {
        return a + b;
    }
}

class Test{
    void show(Integer a){
        System.out.println("Autoboxing");
    }
    void multiArgs(int... a){
        System.out.println(a);
    }
    void overridden(){
        System.out.println("First logic defined");
    }
}

// Test02 extends Test which is necessary for overriding parent class methods
class Test02 extends Test{
    // Method overriding - Method calls are resolved at runtime not compile time
    void overridden(){
        System.out.println("Second logic defined");
    }
}

public class l9_Polymorphism {
    public static void main(String[] args) {
        // Compile-Time polymorphism - is achieved using Method overloading where the same method name has different parameters, either different number of parameters, different type, different order. The compiler then decides which method to call for the given arguments, if no match is found then an error is thrown. 
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));       // number difference
        System.out.println(calc.add(10, 20, 30));   // number difference
        System.out.println(calc.add(5.5, 4.5));     // type difference
        System.out.println(calc.add(10, 5.5));      // order difference
        System.out.println(calc.add(5.5, 10));      // order difference

        // Upcasting - is the 
        Test t1 = new Test02();

        // Autoboxing - is the process of converting a primitive into its wrapper class, ex: int -> Integer, double -> Double -> boolean -> Boolean etc.
        t1.show(10);

        // Varargs - Allows to accept multiple arguments in a method
        t1.multiArgs(4,5,6);

        // Overriden method
        t1.overridden();

        // instanceof keyword - Checks whether an object belongs to a class, subclass or interface
        System.out.println(t1 instanceof Test);
    }
}
