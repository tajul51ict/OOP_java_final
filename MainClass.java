class BaseClass {
    void printResult(String result) {
        System.out.println(result);
    }
}

class SumClass extends BaseClass {
    void computeSumSeries() {
        double sum = 0.0;
        for (double i = 1.0; i >= 0.1; i -= 0.1) {
            sum += i;
        }
        printResult("Sum of series: " + sum);
    }
}

class DivisorMultipleClass extends BaseClass {
    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    void computeGCDLCM(int a, int b) {
        printResult("GCD of " + a + " and " + b + ": " + gcd(a, b));
        printResult("LCM of " + a + " and " + b + ": " + lcm(a, b));
    }
}

class NumberConversionClass extends BaseClass {
    void convertNumber(int num) {
        printResult("Decimal: " + num);
        printResult("Binary: " + Integer.toBinaryString(num));
        printResult("Hexadecimal: " + Integer.toHexString(num).toUpperCase());
        printResult("Octal: " + Integer.toOctalString(num));
    }
}

class CustomPrintClass extends BaseClass {
    void pr(String message) {
        System.out.println("[Formatted Output]: " + message);
    }
}

public class MainClass {
    public static void main(String[] args) {
        
        SumClass sumObj = new SumClass();
        sumObj.computeSumSeries();

        
        DivisorMultipleClass gcdLcmObj = new DivisorMultipleClass();
        gcdLcmObj.computeGCDLCM(24, 36);

        
        NumberConversionClass conversionObj = new NumberConversionClass();
        conversionObj.convertNumber(45);

        
        CustomPrintClass printObj = new CustomPrintClass();
        printObj.pr("Inheritance in Java is powerful!");
    }
}
