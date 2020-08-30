
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int inp1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int inp2 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        int inp3 = Integer.valueOf(scanner.nextLine());
        double avg = ((double)inp1 + inp2 + inp3)/ 3;
        
        System.out.println("The average is " + avg);

    }
}
