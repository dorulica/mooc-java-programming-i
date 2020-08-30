
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int inp = Integer.valueOf(scanner.nextLine());
            
            if (inp != 0) {
                sum = sum + inp;
            } else {
                break;
            }
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
