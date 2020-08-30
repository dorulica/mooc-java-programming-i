
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        
        while(condition == true){
            String inp = scanner.nextLine();
            if (!inp.equals("")){
                String lastWord = inp.substring(inp.lastIndexOf(" ")+1);
                String[] words = inp.split("");
                System.out.println(lastWord);
                
            } else {
                condition = false;
            }
            
        }

    }
}
