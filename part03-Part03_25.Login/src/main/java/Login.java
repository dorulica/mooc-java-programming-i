
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String userName = scanner.nextLine();
        
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        
        String user1 = "alex";
        String pass1 = "sunshine";
        
        String user2 = "emma";
        String pass2 = "haskell";
        
        if (userName.equals(user1) && password.equals(pass1)){
            System.out.println("You have successfully logged in!");
        } else if (userName.equals(user2) && password.equals(pass2)){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
