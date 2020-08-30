import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dorulica
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner, SimpleDictionary dict){
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if(input.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            else if(input.equals("add")){
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                this.dict.add(word, translation);
            }
            else if(input.equals("search")){
                System.out.println("To be translated:");
                String translate = scanner.nextLine();
                if(this.dict.translate(translate) == null){
                    System.out.println("Word " + translate + " was not found");
                    continue;
                } else {
                    System.out.println("Translation: " + this.dict.translate(translate));
                }
                
                    
                
            }
            System.out.println("Unknown command");
        }
    }
}
