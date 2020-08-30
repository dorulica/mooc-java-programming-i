
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        printNumbersInRange(numbers, 1, 8);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : numbers){
            if (num >= lowerLimit && num <= upperLimit){
                result.add(num);     
            }
        }
        System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");
        System.out.println(result);
    }
}
