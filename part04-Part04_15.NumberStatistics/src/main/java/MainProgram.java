
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
//        Statistics statistics = new Statistics();
        Statistics allSum = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();
        
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
        
        boolean condition = true;
        while(condition == true){
            System.out.println("Enter numbers:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input != -1){
                
                allSum.addNumber(input);
                if(input % 2 == 0) {
                    evenSum.addNumber(input);
                }
                else {
                    oddSum.addNumber(input);
                }
            }
            
            else {
                condition = false;
            }
        }
        
               
              
        
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
        System.out.println("Sum of all numbers: " + allSum.sum());
        System.out.println("Sum of even numbers: " + evenSum.sum());
        System.out.println("Sum of odd numbers: " + oddSum.sum());
    }
}
