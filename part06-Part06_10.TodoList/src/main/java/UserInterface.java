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
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String input = scanner.nextLine();
            
            if(input.equalsIgnoreCase("stop")) {
                break;
            }
            
            else if(input.equalsIgnoreCase("add")){
                System.out.println("To add:");
                String add = scanner.nextLine();
                this.list.add(add);
            }
            else if(input.equalsIgnoreCase("list")){
                this.list.print();
                }
            else if(input.equalsIgnoreCase("remove")){
                System.out.println("Which one is removed?");
                int num = Integer.valueOf(scanner.nextLine());
                this.list.remove(num);
            }
            
            
        }
    }
    
}
