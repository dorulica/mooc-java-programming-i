
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int inp1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int inp2 = Integer.valueOf(scanner.nextLine());
        
        System.out.println(inp1 + " * " + inp2 + " = " + (inp1 * inp2));

    }
}
