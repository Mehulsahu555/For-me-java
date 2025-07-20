import java.util.Scanner;

class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.print("Choose an operation (1-5): ");
        int choice = sc.nextInt();
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                int sum = a + b;
                System.out.println("Sum: " + sum);
                break;
            case 2:
                int diff = a - b;
                System.out.println("Difference: " + diff);
                break;
            case 3:
                int mul = a * b;
                System.out.println("Product: " + mul);
                break;
            case 4:
                if (b != 0) {
                    double div = (double) a / b;
                    System.out.println("Quotient: " + div);
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;
            case 5:
                if (b != 0) {
                    int rem = a % b;
                    System.out.println("Remainder: " + rem);
                } else {
                    System.out.println("Error: Modulus by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
