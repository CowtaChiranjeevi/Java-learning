package l28_Mastering_streamAPIs;
import java.util.stream.*;
import java.util.*;

public class l28_Mastering_streamAPIs {
    public static void main(String[] args) {
        // Arrays.asList used to create an array for List interface
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // .stream() method used to convert a List to a stream
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        // There are two ways to create a stream, one is using collections.strea(ArrayList,LinkedList etc) and another one is Stream.of()method and mentioning all the values inside the parantheses 
        Stream<Integer> num2 = Stream.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> oddNums = num2.filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println(oddNums);

        // Streams have different methodssome are intermediate and some are terminal, intermediate operations are lazy and take time to perform whereas terminal operations are immediate.
        Stream<String> names = Stream.of("Abhinav","Bejoy","Chakradhar","Dhanush","Emanuel","Frank","Gaurav","Hari","Abhinav");
        Set<String> upCase = names.filter(n -> n.length() > 5).map(name -> name.toUpperCase()).collect(Collectors.toSet());
        System.out.println(upCase);

        // Using forEach method in streams to perform a terminal operation on every single element which is produced. Since it does not return anything and returns void we cannot store it in any Collection variable.
        Stream<String> names2 = Stream.of("Abhinav","Bejoy","Chakradhar","Dhanush","Emanuel","Frank","Gaurav","Hari","Abhinav");
        names2.forEach(n -> System.out.println(n));


    }
}
