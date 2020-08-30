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
public class Room {
    private ArrayList<Person> people;
    
    public Room(){
        this.people = new ArrayList<>();
    }
    
    public void add(Person person){
        people.add(person);
    }
    
    public boolean isEmpty(){
        if(this.people.isEmpty()){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
        return this.people;
        }
    
    public Person shortest(){
        if(this.people.isEmpty()){
            return null;
        }
        Person shortest = people.get(0);
        for(Person p : people){
            if(shortest.getHeight() > p.getHeight()){
                shortest = p;
            }
        }
        return shortest;
    }
    
    public Person take(){
        //create a placeholder for the shortestPerson
        Person shortest = this.shortest();
        this.people.remove(shortest);
        return shortest;
        
    }
    

}
    

