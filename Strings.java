
import java.util.Scanner;

public class Strings {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();  // strings are immutable
        String surname = sc.nextLine();

        System.out.println(name);

        System.out.println(name.length());

        System.out.println(name + " " + surname);

        System.out.println(name.substring(0,4));

        if (name.compareTo(surname) == 0){
            System.err.println("strings are equal");
        } else {
            System.err.println("strings are not equal");
        }

        sc.close();
    }
}