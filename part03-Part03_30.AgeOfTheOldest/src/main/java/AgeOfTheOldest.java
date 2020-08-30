
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        
        while(true){
            String inp = scanner.nextLine();
            if (inp.equals("")){
                break;
            } 
            String[] parts = inp.split(",");
            
            if (Integer.valueOf(parts[1]) > age){
                age = Integer.valueOf(parts[1]);
            }
                    
        }System.out.println("Age of the oldest: " + age); 
            
    }
}
