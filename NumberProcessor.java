import java.io.*;
import java.util.*;

public class NumberProcessor {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        
        try {
            // Read numbers from input file
            Scanner scanner = new Scanner(new File(inputFile));
            scanner.useDelimiter(",");
            
            List<Integer> numbers = new ArrayList<>();
            while (scanner.hasNext()) {
                String numStr = scanner.next().trim();
                if (!numStr.isEmpty()) {
                    numbers.add(Integer.parseInt(numStr));
                }
            }
            scanner.close();
            
            // Find the highest number and compute sum of natural numbers
            PrintWriter writer = new PrintWriter(new File(outputFile));
            
            for (int num : numbers) {
                int sum = num * (num + 1) / 2; // Sum of first 'num' natural numbers
                writer.print(num + ", " + sum + " ");
            }
            
            writer.close();
            System.out.println("Processing completed. Check output.txt for results.");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in input file.");
        }
    }
}
