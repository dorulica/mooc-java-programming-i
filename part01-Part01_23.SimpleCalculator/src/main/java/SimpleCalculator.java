
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int inp1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int inp2 = Integer.valueOf(scanner.nextLine());
        
        //sum
        System.out.println(inp1 + " + " + inp2 + " = " + (inp1 + inp2));
        
        //diff
        System.out.println(inp1 + " - " + inp2 + " = " + (inp1 - inp2));
        
        //product
        System.out.println(inp1 + " * " + inp2 + " = " + (inp1 * inp2));
        
        //quotient
        System.out.println(inp1 + " / " + inp2 + " = " + ((double) inp1 / inp2));

    }
}
