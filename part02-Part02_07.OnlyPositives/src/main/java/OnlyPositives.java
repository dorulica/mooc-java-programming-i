
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number:");
            int inp = Integer.valueOf(scanner.nextLine());
            
            if (inp < 0) {
                System.out.println("Unsuitable number");
                continue;
            }else if (inp > 0) {
                System.out.println(inp*inp);
                continue;
            }else if (inp == 0) {
                break;
            }
        }
        
        
        

    }
}
