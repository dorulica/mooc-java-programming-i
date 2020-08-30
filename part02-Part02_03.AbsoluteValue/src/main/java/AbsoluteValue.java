
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inp = Integer.valueOf(scanner.nextLine());
        
        if (inp < 0) {
            System.out.println(inp * -1);
            
        } else {
            System.out.println(inp);
        }

    }
}
