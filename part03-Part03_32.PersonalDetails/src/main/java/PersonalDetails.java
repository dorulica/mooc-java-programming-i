
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String name = "";
        
        while(true){
            String inp = scanner.nextLine();
            
            if (inp.equals("")){
                break;
            }
            String[] parts = inp.split(",");
            sum += Integer.valueOf(parts[1]);
            count++;
            
            if(parts[0].length() > name.length()) {
                name = parts[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double)sum/count);

    }
}
