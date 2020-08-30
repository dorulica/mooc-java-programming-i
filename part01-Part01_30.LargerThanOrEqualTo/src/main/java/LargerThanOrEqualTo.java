
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int inp1 = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give the second number:");
        int inp2 = Integer.valueOf(scan.nextLine());
        
        if (inp1 == inp2) {
            System.out.println("The numbers are equal!");
        } else if (inp1 < inp2) {
            System.out.println("Greater number is: " + inp2);
        } else {
            System.out.println("Greater number is: " + inp1);
        }

    }
}
