package com.patterns.structural.flyweight;

import com.sun.xml.internal.ws.db.DatabindingImpl;

import java.util.HashMap;
import java.util.Map;

public class WorkerFactory {
    private static final Map<String, Worker> workerMap = new HashMap<>();

    public Worker getWorkerBySpecialty(String specialty) {
        Worker worker = workerMap.get(specialty);

        if (worker == null) {
            switch (specialty) {
                case "driver":
                    System.out.println("Hiring driver...");
                    worker = new Driver();
                    break;
                case "cooker":
                    System.out.println("Hiring cooker...");
                    worker = new Cooker();
            }
            workerMap.put(specialty, worker);
        }
        return worker;
    }
}


