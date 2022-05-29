package by.tms.hw6.car;

public class Engine {

    private String typeEngine;
    private int fuelConsumption;  //расход на 100 км.

    public Engine(String typeEngine) {
        this.typeEngine = typeEngine;
    }
    public Engine() {
        this.typeEngine = typeEngine;
    }

    public Engine(String typeEngine, int fuelConsumption) {
        this.typeEngine = typeEngine;
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
