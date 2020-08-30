
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList <> ();
        

        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int inp = Integer.valueOf(scanner.nextLine());
            if (inp == 9999) {
                break;
            }
            list.add(inp);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int number = list.get(0);
        
        //placeholder for index possition
        int indexPlaceholder = 0;
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) < number) {
                number = list.get(i);
                indexPlaceholder = i;
            }
            //System.out.println(number);    
        }
        System.out.println("Smallest number: " + number);
        System.out.println("Found at index: " + indexPlaceholder);
    }
}
