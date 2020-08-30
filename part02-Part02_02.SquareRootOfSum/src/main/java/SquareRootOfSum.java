
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inp = Integer.valueOf(scanner.nextLine());
        int inp2 = Integer.valueOf(scanner.nextLine());
        int sum = inp + inp2;
        
        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);
        
        

    }
}
