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
    private Scanner scanner = new Scanner(System.in);
    private JokeManager jokes = new JokeManager();
    
    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = jokes;
        this.scanner = scanner;
    }
    public void start(){
        System.out.println("What a joke!");
        while (true) {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
        String command = scanner.nextLine();
        if (command.equals("X")) {
        break;
        }
        if (command.equals("1")) {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        jokes.addJoke(joke);
        } else if (command.equals("2")) {
        System.out.println("Drawing a joke.");
        System.out.println(jokes.drawJoke());
        } else if (command.equals("3")) {
        jokes.printJokes();
        }
        }
    }
    
}