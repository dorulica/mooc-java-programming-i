
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int inp = Integer.valueOf(scanner.nextLine());
            
            if (inp != 0 && inp < 0) {
                count++;
            } else if (inp == 0){
                break;
            } else {
                continue;
            }
        }
        System.out.println("Number of negative numbers: " + count);
    }
}
