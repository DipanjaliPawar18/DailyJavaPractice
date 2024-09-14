import java.util.*;

public class Arrays{
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.println( numbers[i] );
        }

        // Linear search

        System.out.println("enter number to be found in the array:");
        int k  = sc.nextInt(); // number to be found in the array

        for(int i = 0; i < n; i++){
            if(numbers[i] == k){
            System.out.println("the desired number found at index : " + i);
          }
        }

        sc.close();
    }
}