package l17_GenericClasses_CollectionFramework;

    // class defined with a generic method inside it, since it is static it must be called only using its class and not instantiated.
public class Printer{
    public static <D,E> void printElements(D first, E second){
        System.out.println(first);
        System.out.println(second);
    }
 }
