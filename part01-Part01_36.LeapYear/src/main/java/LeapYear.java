
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a year: ");
        int inp = Integer.valueOf(scan.nextLine());
        
        if (inp % 400 == 0) {
            System.out.println("The year is a leap year.");
            
        } else if (inp % 100 == 0) {
            System.out.println("The year is not a leap year");
            
        } else if (inp % 4 == 0) {
            System.out.println("The year is a leap year.");
          
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
