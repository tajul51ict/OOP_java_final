public class ArraySumCalculator {

        public static int calculateSum(int[] array) {
        int sum = 0;
               for (int num : array) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
              int[] numbers = { 10, 20, 30, 40, 50 };

               int result = calculateSum(numbers);

               System.out.println("The sum of all elements in the array is: " + result);
    }
}