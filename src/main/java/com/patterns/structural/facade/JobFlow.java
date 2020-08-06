package com.patterns.structural.facade;

public class JobFlow {
    Worker worker = new Worker();
    Job job = new Job();
    JobTracker jobTracker = new JobTracker();

    public void solveProblems() {
        job.doJob();
        jobTracker.isActiveness();
        worker.doJobBeforeTheEndOfTheShift(jobTracker);
    }
}
