
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How old are you? ");
        int inp = Integer.valueOf(scan.nextLine());
        
        if (inp >= 0 && inp <= 120 ) {
            System.out.println("Ok");
        } else {
            System.out.println("Impossible!");
        }
        

    }
}
