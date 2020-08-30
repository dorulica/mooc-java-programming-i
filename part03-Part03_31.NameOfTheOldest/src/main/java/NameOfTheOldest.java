
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        while(true){
            String inp = scanner.nextLine();
            if (inp.equals("")){
                break;
            }
            String[] parts = inp.split(",");
            if (Integer.valueOf(parts[1]) > age) {
                age = Integer.valueOf(parts[1]);
                name = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
