import java.util.*;

class Loops{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println(n);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*n);
        }

        System.out.println("\n");

        int j = 1;

        while(j <11){
            System.out.println(j*n);
            j++;
        }

        do { 
            System.out.println("true");
            n++;
        } while (n<10);
    }
}
