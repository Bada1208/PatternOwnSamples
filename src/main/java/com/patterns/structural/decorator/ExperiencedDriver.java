package com.patterns.structural.decorator;

public class ExperiencedDriver extends WorkerDecorator {
    public ExperiencedDriver(Worker worker) {
        super(worker);
    }


    @Override
    public String makeJob() {
        return super.makeJob() + makeHisJob();
    }

    public String makeHisJob() {
        return "Make his job";
    }
}
