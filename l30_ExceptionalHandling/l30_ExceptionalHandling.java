package l30_ExceptionalHandling;

public class l30_ExceptionalHandling {
    public static void main(String[] args) {
        // 
        int dividend = 10;
        int divisor = 0;
        try {
            int result = dividend / divisor;
            System.out.println(result);
        }
        catch(Exception msg){
            System.out.println("The exception of "+msg+" occured");
        }
        finally{
            System.out.println("Try / Catch have been executed.");
        }
        
    }
}
