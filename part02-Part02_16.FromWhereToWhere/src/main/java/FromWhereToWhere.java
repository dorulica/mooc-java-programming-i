
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int inpTo = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        int inpFrom = Integer.valueOf(scanner.nextLine());
        
        for (int i = inpFrom; i <= inpTo; i++) {
            System.out.println(i);
        }
    }
}
