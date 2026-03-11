import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, choice;
        double result;

        System.out.println("Simple Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter your choice (1-4): ");
        choice = sc.nextInt();

        switch(choice){

            case 1:
                result = a + b;
                System.out.println("Result = " + result);
                break;

            case 2:
                result = a - b;
                System.out.println("Result = " + result);
                break;

            case 3:
                result = a * b;
                System.out.println("Result = " + result);
                break;

            case 4:
                result = a / b;
                System.out.println("Result = " + result);
                break;

            default:
                System.out.println("Invalid choice");

        }

    }
}
