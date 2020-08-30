
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean condition = true;
        
        while (condition == true) {
            String inp = scanner.nextLine();
            
            if (!(inp.equals(""))){
                String [] words = inp.split(" ");
                System.out.println(words[0]);
            } else {
                condition = false;
            }
        }
    }
}
