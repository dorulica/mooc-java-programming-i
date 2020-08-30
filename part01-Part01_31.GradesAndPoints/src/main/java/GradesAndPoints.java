
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int inp = Integer.valueOf(scan.nextLine());
        
        if (inp < 0) {
            System.out.println("Grade: impossible!");
        } else if (inp <= 49) {
            System.out.println("Grade: failed");
        } else if (inp >= 50 && inp < 60) {
            System.out.println("Grade: 1");
        } else if (inp >= 60 && inp < 70) {
            System.out.println("Grade: 2");
        } else if (inp >= 70 && inp < 80) {
            System.out.println("Grade: 3");
        } else if (inp >= 80 && inp < 90) {
            System.out.println("Grade: 4");
        } else if (inp >= 90 && inp < 101) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }

    }
}
