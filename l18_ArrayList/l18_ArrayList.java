package l18_ArrayList;
import java.util.ArrayList;
// import java.util.List;

public class l18_ArrayList {
    public static void main(String[] args) {
        // First arraylist extended into second arraylist.
        ArrayList<String> cars01 = new ArrayList<>();
        cars01.add("Bentley");
        cars01.add("Chevrolet");
        
        // Created an arraylist using arraylist class.
        ArrayList<String> cars = new ArrayList<>(cars01);
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Benz");
        cars.add("Jaguar");
        cars.add("Volvo");
        // new element added with an index specifically puts the element at that index number
        cars.add(1,"Aston Martin");
        System.out.println(cars);
        System.out.println(cars.get(2));
        cars.set(3,"Ferrari");
        System.out.println(cars);
        cars.remove(4);
        System.out.println(cars);
        // .clear is used to remove the entire array.
        cars.clear();
        System.out.println(cars);
    }
}
