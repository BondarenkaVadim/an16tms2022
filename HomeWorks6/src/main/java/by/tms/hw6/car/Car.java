package by.tms.hw6.car;

import java.util.Random;

public class Car {
    private String model;
    private String colort;
    private final Engine engine;
    private GasTank gasTank;
    private boolean engineStart;

    private int mileage = 100;
    //  private GasTank volumeGasTank = new GasTank();

//    public Car(String model, String colort, Engine engine, GasTank gasTank) {
//        this.model = model;
//        this.colort = colort;
//        this.engine = engine;
//        this.gasTank = gasTank;
//        this.mileage = mileage;
//    }


    public Car(String model, String colort, Engine engine, GasTank gasTank) {
        this.model = model;
        this.colort = colort;
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public int distans() {
        Random random = new Random();
        int distans = 0;
        if (this.engineStart) {
            distans = random.nextInt(gasTank.getAmountOfGas() * 100 / engine.getFuelConsumption()); // проедет, но не более чем хватит отплава
            this.mileage = this.mileage + distans;

        } else {
            System.out.println("engine not running");
        }



        return distans;
    }

    public void startEngine() {
        //     boolean engineStart;
        if (gasTank.getAmountOfGas() > 0) {
            System.out.println("Engine on!!");
            this.engineStart = true;
        } else {
            System.out.println("Engine off, Gass off");
            this.engineStart = false;
        }
    }


    public int getMileage() {
        return mileage;
    }
}
