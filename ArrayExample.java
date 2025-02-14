public class ArrayExample {
        static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; 
        System.out.println("Array elements:");
        printArray(numbers);
    }
}
