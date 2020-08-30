
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        System.out.println("Give cube edge length");
        int edge = Integer.valueOf(scanner.nextLine());
        
        Cube cube = new Cube(edge);
        System.out.println(cube.toString());
    }
}
