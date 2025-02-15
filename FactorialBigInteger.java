import java.math.BigInteger;

public class FactorialBigInteger {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 50; 
        System.out.println(number + "! = " + factorial(number));
    }
}
