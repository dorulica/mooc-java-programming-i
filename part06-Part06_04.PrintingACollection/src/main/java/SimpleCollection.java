
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String output = "The collection " + this.name;
        String elemName = "";
        
        //get elem count and names from the list
        for(String e : elements){
            elemName = elemName + "\n" + e;
        }
        
        if (this.elements.isEmpty()){
            return output + " is empty.";
        }
        else if (this.elements.size() == 1){
            return output + " has " + this.elements.size() + " element:" + elemName;
            
        }
        else {
            return output + " has " + this.elements.size() + " elements:" + elemName;
        }
        
    }
    
}
