import java.util.Scanner;

public class PalindromeChecker {

        static boolean isNumberPalindrome(int num) {
        int original = num, reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return original == reverse;
    }

        static boolean isStringPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(num + " is " + (isNumberPalindrome(num) ? "" : "not ") + "a palindrome.");

        scanner.nextLine();
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println(str + " is " + (isStringPalindrome(str) ? "" : "not ") + "a palindrome.");

        scanner.close();
    }
}
