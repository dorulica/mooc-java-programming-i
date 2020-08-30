import java.util.ArrayList;
import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dorulica
 */
public class GradeRegister {
    
    private ArrayList<Integer> points;
    
    public GradeRegister(){
        this.points = new ArrayList<>();
    }
    
    public void addPoints(int point){
        points.add(point);
    }
    
    public double pointsAverage(){
        double sum = 0.0;
        for(double p : points){
            sum += p;
        }
        return sum / points.size();
    }
    
    public double passingPointsAverage(){
        double sum = 0.0;
        int count = 0;
        for(double p : points){
            if(p >= 50.0){
                sum += p;
                count++;
            }
        }
        return sum / count;
    }
    
    public double passPercentage(){
        int count = 0;
        for(double p : points){
            if(p >= 50.0){
                count++;
            }
        }
        return ((1.0 * count) / this.points.size()) * 100;
    }
    
    public void pointsToGrades(){
        //create new arraylist to store grades
        ArrayList<Integer> grade = new ArrayList<>();
        
        //iterate over the points list and add items to grade list accordingly
        for(Integer p : points){
            if(p < 50){
                grade.add(0);
            }
            else if(p < 60){
                grade.add(1);
            }
            else if(p < 70){
                grade.add(2);
            }
            else if(p < 80){
                grade.add(3);
            }
            else if(p < 90){
                grade.add(4);
            }
            else if(p >= 90){
                grade.add(5);
            }
        
        for(int g : grade){
            for(int i = 0; i<=grade.get(g); i++){
                System.out.print("*");
            }
            System.out.print("");
        }
        }
        
    }
}
