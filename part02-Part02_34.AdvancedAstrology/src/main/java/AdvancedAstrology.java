
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int num = 0;
        int spaces = size - 1;
        int stars = size - spaces;
        while (num < size) {
            printSpaces(spaces);
            printStars(stars);
            spaces=spaces-1;
            stars++;
            num++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int num = 0;
        int spaces = height - 1;
        int stars = 1;
        while(num < height){
            printSpaces(spaces);
            printStars(stars);
            spaces = spaces - 1;
            stars = stars + 2;
            num++;
        }
        //defining the base of the three
        int row = 0;
        while(row < 2){
            printSpaces(height - 2);
            printStars(3);
            row ++;
        }
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
