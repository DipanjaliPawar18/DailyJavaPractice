import java.util.*;

public class Patterns{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
               // int sum = i + j;
                if(i == 1 || i == n || j == 1 || j == m){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");            
            }
            System.out.println();
        }

        System.out.println();

        for (int i = n; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("* ");            
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }        
        
        System.out.println();

        int counter = 1;

        for (int i = 1; i <= n; i++){
           
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        } 
        
        System.out.println();
        for (int i = 1; i <= n; i++){
           
            for(int j = 1; j <= i; j++){
                int sum = i + j;

                if(sum % 2 == 0){
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        } 
        System.out.println();

        
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i ; j++){               
                System.out.print("  ");            
            }

            for(int j = 1; j <= i; j++){               
                System.out.print("* ");            
            }
           
            System.out.println();
        }

        System.out.println();

        
        for (int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i ; j++){               
                System.out.print("  ");            
            }

            for(int j = 1; j <= i; j++){               
                System.out.print("* ");            
            }
           
            System.out.println();
        }

        sc.close();
    }
}