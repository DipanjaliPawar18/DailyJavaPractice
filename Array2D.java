import java.util.Scanner;

public class Array2D {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        System.out.println("give the input as matrix elements:");
       
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }

            System.out.println();
        }

        System.out.println("the matrix of n rows and m column is :");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " "); 
            }

            System.out.println();
        }

        System.out.println("give the number to be found:");
        int k = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (matrix[i][j] == k){
                    System.out.print("the desired element found at " + i +" row and " + j + " column"); 
                }
                
            }
        }
        sc.close();

    }
}