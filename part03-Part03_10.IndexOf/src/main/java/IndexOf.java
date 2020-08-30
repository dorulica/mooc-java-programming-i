
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        
        System.out.println("Search for?");
        int inp = Integer.valueOf(scanner.nextLine());
        
        //iterate over the list
        for (int i = 0; i < list.size(); i++){
            
            //if iterator == input break the program
            if (list.get(i) == inp) {
                System.out.println(list.get(i) + " is at index " + i);  
     
            }
        
        }
    }
}
