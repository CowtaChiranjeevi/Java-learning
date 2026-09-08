package l16_Arrays_2D;
// import java.util.Scanner;
import java.util.Arrays;

public class arrays2d {
    public static void main(String[] args) {
        // 15.1 Creating a 2D array (Declaration and memor allocation)
        int a1[][] = new int[3][3];
        a1[0][0] = 1;
        a1[0][1] = 2;
        a1[0][2] = 3;
        a1[1][0] = 4;
        a1[1][1] = 5;
        a1[1][2] = 6;
        a1[2][0] = 7;
        a1[2][1] = 8;
        a1[2][2] = 9;

        // 15.2 Printing the values of the matrix (2d array)
        for(int i=0; i<a1.length; i++){
            for(int j=0; j<a1[i].length; j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        // Printing the values using for each loop instead of normal for loop
        for(int[] i : a1){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        // 15.3 Addition of two matrices, only adds 2d arrays with the same rows and columns
        // Arrays declaration and initialization
        int[] []b = {{1,2,3},{4,5,6},{7,8,9}};
        int []c[] = {{3,2,1},{6,5,4},{9,8,7}}; 
        int d[][] = new int[b.length][b[0].length];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                d[i][j] = b[i][j] + c[i][j];
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        // 15.4 Creating a 2d array by taking user input.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of rows in matrix: ");
        // int row = sc.nextInt();
        // System.out.println("Enter the number of columns in matrix: ");
        // int col = sc.nextInt();
        // int userArr[][] = new int[row][col];
        // System.out.println("Enter the input values for the matrix below");
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         userArr[i][j] = sc.nextInt();
        //     }
        // }
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print(userArr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // 15.5 Finding missing element in a 1D array.
        int e[] = {1,2,3,4,5,8};
        for(int i=0;i<e.length-1;i++){
            for(int j=e[i];j<e[i+1];j++){
                if(e[i] != j) System.out.println("Missing element(s): "+j);
            }
        }

        // 15.6 Extending the length of an existing array using Arrays.copyOf mehtod, import required.
        int f[] = {12,545,234,21,5,456,22};
        f = Arrays.copyOf(f,f.length + 2);

        f[f.length-1] = 25;
        f[f.length-2] = 56;
        for(int i : f){
            System.out.print(i+" ");
        }


        
        
    }
}
