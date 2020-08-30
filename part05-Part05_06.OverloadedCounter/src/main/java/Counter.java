/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dorulica
 */
public class Counter {
    private int startValue;
    
    public Counter(){
        this(0);
    }
    public Counter(int value){
        this.startValue = value;
    }
    
    public int value(){
        return this.startValue;
    }
    
    public void increase(){
        this.startValue++;
    }
    public void increase(int increaseBy){
        if (increaseBy < 0) {
            this.startValue = startValue;
            
        }
        else {
            this.startValue += increaseBy;
        }
    }
    
    public void decrease(){
        this.startValue--;
    }
    
    public void decrease(int decreaseBy){
        if(decreaseBy < 0){
            this.startValue = startValue;
        }
        else {
            this.startValue -= decreaseBy;
        }
    }
    
    
}
