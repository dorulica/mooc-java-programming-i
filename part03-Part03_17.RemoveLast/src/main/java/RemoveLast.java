
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList();
        strings.add("cucu");
        strings.add("cucu1");
        strings.add("cucu2");
        
        removeLast(strings);
        System.out.println(strings);
    }
    
    public static void removeLast(ArrayList<String> strings){
        if (strings.size() != 0){
            strings.remove(strings.size()-1);
        }
    }
}
