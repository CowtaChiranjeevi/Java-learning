package l10_Abstraction;

// abstract class that requires its methods to be implemented in subclass, unless another acess modifier is mentioned
abstract class Vehicle{
    int maxSpeed = 150;
    abstract void start();
    abstract void stop();
    void displayMaxSpeed(){
        System.out.println(maxSpeed);
    }
}

// subclass that implements(overrides) the methods from the abstract class
class Car extends Vehicle{
    void start(){
        System.out.println("Start");
    }
    void stop(){
        System.out.println("Stop");
    }
}

class abstraction{
    public static void main(String[] args) {
        System.out.println("Hi");

        // Objects defined using abstract class but built with using the sub class constructor works, but using abstract class constructor does not.
        Vehicle c1 = new Car();
        c1.start();
        c1.stop();
    }
}