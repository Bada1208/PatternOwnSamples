package com.patterns.structural.facade;

public class Worker {
    public void doJobBeforeTheEndOfTheShift(JobTracker jobTracker){
        if(jobTracker.isActiveness()) System.out.println("Worker do his job...");
        else System.out.println("Worker rests...");
    }
}
