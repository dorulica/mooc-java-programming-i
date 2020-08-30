
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean condition = true;
        
        while (condition == true) {
            String inp = scanner.nextLine();
            
            if (!(inp.equals(""))){
                String [] words = inp.split(" ");
                for (String word : words){
                    if (word.contains("av")){
                        System.out.println(word);
                    }
                    
                    
                }
            } else {
                condition = false;
            }
        }

    }
}
