
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = Integer.valueOf(scanner.nextLine());
        
        int square = inp * inp;
        
        System.out.println(square);

    }
}
