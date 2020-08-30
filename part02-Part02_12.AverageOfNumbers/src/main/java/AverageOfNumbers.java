
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int inp = Integer.valueOf(scanner.nextLine());
            
            if (inp != 0) {
                count ++;
                sum = sum + inp;
            } else {
                break;
            }
            
        }
        System.out.println("Average of the numbers: " + ((double)sum/count));
    }
}
