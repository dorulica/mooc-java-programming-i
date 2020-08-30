
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        //get the name of the file to read
        System.out.println("Name of the file:");
        String fileToRead = scanner.nextLine();
        
        //try to read the file or catch errors reading file
        try{
            Scanner scanFile = new Scanner(Paths.get(fileToRead));
            while(scanFile.hasNextLine()){
                
                
                //read rows
                String row = scanFile.nextLine();
                if ( row != null && row.isEmpty() == false) {
                //split info by coma on each row
                String[] partsRow = row.split(",");
                
                //assign parts to variables
                String name = partsRow[0];
                int age = Integer.valueOf(partsRow[1]);
                
                
                //formatting year/years and printing the results
                if(age == 1) {
                    
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    
                
                    
                System.out.println(name + ", age: " + age + " years");
                }
                }
                
                
            }
                
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
                
                
        
}

