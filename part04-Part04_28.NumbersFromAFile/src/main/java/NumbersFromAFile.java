
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numCount = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try(Scanner scanFile = new Scanner(Paths.get(file))){
            while (scanFile.hasNextLine()){
                int row = Integer.valueOf(scanFile.nextLine());
                if(row >= lowerBound && row <= upperBound){
                    numCount++;
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        //test fails with just numCount
        System.out.println("Numbers: " + numCount);

    }

}
