import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookInformation = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            System.out.println("Title:");
            String inpTitle = scanner.nextLine();
            
            if(inpTitle.isEmpty()){
                break;
            }
            
            System.out.println("Pages:");
            int inpPages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year:");
            int inpPublicationYear = Integer.valueOf(scanner.nextLine());
            
            bookInformation.add(new Book(inpTitle, inpPages, inpPublicationYear));
        }
        System.out.println("What information will be printed?");
        String inputInformation = scanner.nextLine();
        
        for(Book name: bookInformation){
            if (inputInformation.equals("everything")){
                System.out.println(name.getTitle() + ", " + name.getPages() + " pages, " + name.getYear());
            }
            else if(inputInformation.equals("name")){
                System.out.println(name.getTitle());
            }
        }
        
    }
            
            
        
            
            
        
        
}

