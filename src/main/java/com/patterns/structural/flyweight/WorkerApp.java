package com.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class WorkerApp {
    public static void main(String[] args) {
        WorkerFactory workerFactory = new WorkerFactory();

        List<Worker> workerList = new ArrayList<>();

        workerList.add(workerFactory.getWorkerBySpecialty("driver"));
        workerList.add(workerFactory.getWorkerBySpecialty("driver"));
        workerList.add(workerFactory.getWorkerBySpecialty("driver"));
        workerList.add(workerFactory.getWorkerBySpecialty("driver"));
        workerList.add(workerFactory.getWorkerBySpecialty("driver"));
        workerList.add(workerFactory.getWorkerBySpecialty("cooker"));
        workerList.add(workerFactory.getWorkerBySpecialty("cooker"));
        workerList.add(workerFactory.getWorkerBySpecialty("cooker"));
        workerList.add(workerFactory.getWorkerBySpecialty("cooker"));

        for (Worker worker : workerList) {
            worker.doWork();
        }
    }
}

