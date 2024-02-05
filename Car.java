// Car.java

import java.util.Scanner;

public class Car {
    private String modelName;
    private String details;
    public Scanner scanner;

    // public Car(){}

    public Car(String modelName, String details) {
        this.modelName = modelName;
        this.details = details;
    }

    public String getModelName() {
        return modelName;
    }

    public String getDetails() {
        return details;
    }
}

