import java.util.Scanner;

public class PatternGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a pattern:");
        System.out.println("1. Square Pattern");
        System.out.println("2. Triangle Pattern");
        System.out.println("3. Diamond Pattern");
        System.out.println("4. Number Pattern");
        System.out.println("5. Hollow Square Pattern");
        System.out.println("6. Hollow Triangle Pattern");
        System.out.println("7. Pyramid Pattern");
        System.out.println("8. Reverse Triangle Pattern");
        int choice = scanner.nextInt();
        System.out.println("Enter the size of the pattern:");
        int n = scanner.nextInt();
        scanner.close();

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
            case 5:
                hollowSquarePattern(n);
                break;
            case 6:
                hollowTrianglePattern(n);
                break;
            case 7:
                pyramidPattern(n);
                break;
            case 8:
                reverseTrianglePattern(n);
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

    public static void hollowSquarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowTrianglePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pyramidPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverseTrianglePattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
