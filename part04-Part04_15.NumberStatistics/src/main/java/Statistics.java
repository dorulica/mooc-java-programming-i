
public class Statistics {
    private int numCount;
    private int sum;
    
    
    public Statistics(){
        this.numCount = numCount;
        
    }
    
    public void addNumber(int number){
        if(this.numCount != -1){
            sum += number;
            numCount++;
        }
    }
    
    public int getCount(){
        return this.numCount;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average(){
        if(sum != 0 && numCount != 0){
            return (double) sum/numCount;
        } else {
            return 0;
        }
        
    }
}
