package by.tms.hw6.car;

import java.util.Random;

public class Car {
    private String model;
    private String colort;
    private Engine engine = new Engine();
    private int mileage = 100;
    private GasTank volumeGasTank = new GasTank();

    public int distans(boolean engineStart, int amountOfGas) {
        Random random = new Random();
        int distans = 0;
        if (engineStart == true) {
            distans = random.nextInt(amountOfGas * 100 / engine.getFuelConsumption()); // проедет, но не более чем хватит отплава
            this.mileage = this.mileage + distans;
        }
        return distans;
    }

    public int getMileage() {
        return mileage;
    }
}
