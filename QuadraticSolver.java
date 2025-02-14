import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for coefficients a, b, and c
        System.out.print("Enter coefficients a, b, and c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("No real roots.");
        } else {
            // Calculate the two roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);

            // Find the smallest positive root
            double smallestPositiveRoot = Double.MAX_VALUE;
            
            if (root1 > 0) smallestPositiveRoot = root1;
            if (root2 > 0 && root2 < smallestPositiveRoot) smallestPositiveRoot = root2;
            
            if (smallestPositiveRoot == Double.MAX_VALUE) {
                System.out.println("No positive real roots.");
            } else {
                System.out.println("The smallest positive root is: " + smallestPositiveRoot);
            }
        }

        scanner.close();
    }
}
