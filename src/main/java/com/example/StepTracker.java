package com.example;

//write your class implementation here
public class StepTracker{
    private int minSteps;
    private int activeDays;
    private int totalSteps;
    private int noDays;

    public StepTracker (int minSteps){
        this.minSteps=minSteps;
        this.activeDays=0;
        this.totalSteps=0;
        this.noDays=0;
    }    
    public int getMinSteps(){
        return this.minSteps;
    }
    public int activeDays(){
        return this.activeDays;
    }
    public double averageSteps(){
        if (noDays>0){
            return (double) totalSteps/noDays;
        }
        return 0;
    }
    public void addDailySteps(int todaySteps){
        if (todaySteps>minSteps){
            activeDays++;
        }
        totalSteps+=todaySteps;
        noDays++;

    }
    
}   