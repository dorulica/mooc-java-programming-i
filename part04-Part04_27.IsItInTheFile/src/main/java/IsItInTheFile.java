
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        //setting another instance of scanner to read suggested file
        try(Scanner scanFile = new Scanner(Paths.get(file))){
            //read all rows on the file
            while(scanFile.hasNextLine()){
                String row = scanFile.nextLine();
                if(row.contains(searchedFor)){
                    System.out.println("Found!");
                    
                    //gets us out of the while loop
                    return;
                } 
                
            }
            System.out.println("Not found.");
            
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
