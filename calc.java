import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();


      int product = num1 * num2;
System.out.println("The product is: " + product);

     if (num2 != 0) {
    double quotient = (double) num1 / num2;
    System.out.println("The quotient is: " + quotient);
} else {
    System.out.println("Division by zero is not allowed.");
}




    }
}
