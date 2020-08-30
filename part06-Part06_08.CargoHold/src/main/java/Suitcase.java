import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dorulica
 */
public class Suitcase {
    
    private int maxWeight;
    
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        //check if the diff between maxWeight and current weight on the list
        //is less than the next item to be added
        
        int localWeight = 0;
        for(Item i : items){
            localWeight += i.getWeight();
        }
        //add item to the list
        if((this.maxWeight - localWeight) >= item.getWeight()){
            this.items.add(item);
        }
    }
    
    public String toString(){
        int suitcaseWeight = 0;
        for (Item i : items){
            suitcaseWeight += i.getWeight();
        }
            
        if(this.items.isEmpty()){
            return "no items (0 kg)";
        }
        else if(this.items.size() == 1){
            return  "1 item (" + suitcaseWeight + " kg)";
        }

        return this.items.size() + " items (" + suitcaseWeight + " kg)";
  
    }
    
    public void printItems(){
        for (Item i : items){
            System.out.println(i.toString());
        }
    }
    
    public int totalWeight(){
        int sum = 0;
        for(Item i : items){
            sum += i.getWeight();
        }
        return sum;
    }
    
    public Item heaviestItem(){
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = new Item ("", 0);
        for (Item item:this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}
