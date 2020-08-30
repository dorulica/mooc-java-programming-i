
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        
        while (true) {
            int inp = Integer.valueOf(scanner.nextLine());
            
            if (inp == 0) {
                break;
            } else if (inp < 0) {
                continue;
            } else {
                count ++;
                sum = sum + inp;
            }
        
        }
        
        if (count == 0) {
            System.out.println("Cannot calculate the averag");
        } else {
            System.out.println((double)sum / count);
        }
    }
   
}
