
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
    public String longest(){
        if(this.elements.size()< 1){
            return null;
        }
        String longestReturn = this.elements.get(0);
        for(String e : elements){
            if(longestReturn.length() < e.length()){
                longestReturn = e;
            }
        }
        return longestReturn;
    }

}
