package l15_Arrays_1D;
import java.util.Scanner;

public class arrays1d {
    public static void main(String[] args) {
        // Used to create an array when the values may not always be present but we have an idea of the length
       int a[] = new int[5];
        a[0] = 45;
        a[1] = 36;
        a[2] = 18;
        a[3] = 78;
        a[4] = 65; 
        System.out.println(a);

        // Arrays can be created using different data types ,byte, short, int , boolean , String etc.
        boolean b[] = new boolean[4];
        System.out.println(b[2]);


        // Creating an array and assigning values using curly braces for a fixed length and values.
        int c[] = {3,5,7,8,1};
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");   
        }
        System.out.println();
        System.out.println("Length of the array is: "+c.length);

        // Creating an array of items exactly the reverse order of another array.
        int d[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            d[i] = a[a.length - 1 - i];
            System.out.print(d[i]+" ");
        }
        System.out.println();

        // For each loop in java used to traverse an array, i is the value of the item in the array and not the index value
        for(int i : d){
            System.out.print(i+" ");
        }
        System.out.println();

        // Creating an array using input values.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of new array: ");
        int e = sc.nextInt();
        int f[] = new int[e];
        for(int i=0;i<f.length;i++){
            System.out.print("Enter the value of array index "+(i)+"  ");
            f[i] = sc.nextInt();
        }
        for(int i : f){
            System.out.print(i+" ");
        }
    } 
}
