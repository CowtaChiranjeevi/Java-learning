package l31_TypesOfExceptions;

public class l31_TypesOfExceptions {
    public static void main(String[] args) {
        // Checking if a class name exists within the file
        try{
            Class.forName("com.example.UnknownClass");
            System.out.println("There is a class with the given name");
        }
        catch(ClassNotFoundException e){
            System.out.println("There is no such class");
        }

        // Result if a class name does exist
        try{
            Class.forName("java.util.Scanner");
            System.out.println("2nd class found");
        }
        catch(ClassNotFoundException e){
            System.out.println("2nd class not found");
        }

        // Writing an invalid logic (trying to find the length of null)
        try{
            String name = null;
            System.out.println(name.length());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
