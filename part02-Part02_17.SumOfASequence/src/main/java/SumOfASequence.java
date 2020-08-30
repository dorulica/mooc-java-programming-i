
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inp = Integer.valueOf(scanner.nextLine());
        int count = 0;
        int result = 0;
        
        for (int i = 1; i <= inp; i++){
            result += i;
            count ++;
        }
        System.out.println("Last number?" + count);
        System.out.println("The sum is " + result);
        

    }
}
