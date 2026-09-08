package l11_Interface1;

// 1st interace
interface Machine{
    void start();
    void works();
}

// 2nd interface inheriting the first interface
interface Vehicle extends Machine{
    int maxSpeed = 150;
    void start();
    void stop();
}

// Class that implements the 2nd interface, can also directly implement both the interfaces.
class Car implements Vehicle{
    public void works(){
        System.out.println("No repairs, working properly");
    }
    public void start(){
        System.out.println("Start");
    }
    public void stop(){
        System.out.println("stop");
    }
}

// Main class and main method inside the class
public class interface1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.works();
        c1.start();
        c1.stop();
    }
}
