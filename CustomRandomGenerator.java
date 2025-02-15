import java.util.Random;

public class CustomRandomGenerator {
        private static final int[] predefinedArray = {3, 7, 11, 17, 23, 31, 41, 53, 61, 73};
    
        public static int[] myRand(int n, int maxValue) {
        int[] randomNumbers = new int[n];
        long currentTime = System.currentTimeMillis();        
        for (int i = 0; i < n; i++) {
            int index = i % predefinedArray.length;
            randomNumbers[i] = (int) ((currentTime * predefinedArray[index]) % maxValue);
        }
        return randomNumbers;
    }

       public static int myRand(int maxValue) {
        long currentTime = System.currentTimeMillis();
        int index = (int) (currentTime % predefinedArray.length);
        return (int) ((currentTime * predefinedArray[index]) % maxValue);
    }

      public static double myRand() {
        long currentTime = System.currentTimeMillis();
        int index = (int) (currentTime % predefinedArray.length);
        return ((currentTime * predefinedArray[index]) % 10000) / 100.0;     }

       public static void main(String[] args) {
        int n = 5;
        int maxValue = 100;

            int[] randomNumbers = myRand(n, maxValue);
        System.out.println("Generated Random Numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

              System.out.println("\nSingle Random Number: " + myRand(maxValue));

             System.out.println("\nRandom Floating-Point Number: " + myRand());
    }
}
