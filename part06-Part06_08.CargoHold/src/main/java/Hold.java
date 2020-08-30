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
public class Hold {
    private ArrayList<Suitcase>cargoList;
    private int maxCargoWeight;
    
    public Hold(int maxCargoWeight){
        this.cargoList = new ArrayList<>();
        this.maxCargoWeight = maxCargoWeight;
        
    }
    public void addSuitcase(Suitcase suitcase){
        int weight = 0;
        for(Suitcase s : cargoList){
            weight += s.totalWeight();
        }
        if ((maxCargoWeight - weight) >= suitcase.totalWeight()){
            cargoList.add(suitcase);
        }
    }
    
    public String toString(){
        int counter = 0;
        for(Suitcase s : cargoList){
            counter += s.totalWeight();
        }
        if(cargoList.isEmpty()){
            return null;
        } else if(cargoList.size() == 1){
            return this.cargoList.size() + " suitcase (" + counter + "kg)";
        }
        return this.cargoList.size() + " suitcases (" + counter + "kg)";
    }
    
    public void printItems(){
        for(Suitcase s : cargoList){
            s.printItems();
        }
    }
}
