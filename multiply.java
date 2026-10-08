import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter first number: ") ;
        int a = sc.nextInt() ;

        System.out.print("Enter second number: ") ;
        int b = sc.nextInt() ;

        int result = a * b;

        System.out.println("Multiplication = " + result) ;

    }
}