
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double inp = Double.valueOf(scan.nextLine());
        
        
        if (inp > 0 && inp < 5000) {
            System.out.println("No tax!");
            
        } else if (inp > 5000 && inp <= 25000) {
            double check = 5000;
            System.out.println("Tax: " + (100 + (inp-check)*0.08));
            
        } else if (inp > 25000 && inp  <= 55000) {
            double check = 25000;
            System.out.println("Tax: " + (1700+(inp - check)*0.10));
            
        } else if (inp > 55000 && inp <= 200000) {
            double check = 55000;
            System.out.println("Tax: " + (4700+(inp - check)*0.12));
            
        } else if (inp > 200000 && inp <= 1000000) {
            double check = 200000;
            System.out.println("Tax: " + (22100+(inp - check)*0.15));
            
        } else {
            double check = 1000000;
            System.out.println("Tax: " + (142100 + (inp - check)* 0.17));
        }
        
    }
}
