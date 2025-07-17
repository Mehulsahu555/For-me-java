import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a pattern:");
        System.out.println("1. Square Pattern");
        System.out.println("2. Triangle Pattern");
        System.out.println("3. Diamond Pattern");
        System.out.println("4. Number Pattern");
        int choice = scanner.nextInt();
        System.out.println("Enter the size of the pattern:");
        int n = scanner.nextInt();

        switch (choice) {
            case 1:
                squarePattern(n);
                break;
            case 2:
                trianglePattern(n);
                break;
            case 3:
                diamondPattern(n);
                break;
            case 4:
                numberPattern(n);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void squarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void trianglePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int n) {
        // Print upper half of diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Print lower half of diamond
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
