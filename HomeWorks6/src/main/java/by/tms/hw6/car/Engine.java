package by.tms.hw6.car;

public class Engine {

    public String typeEngine;
    private int fuelConsumption = 10;  //расход на 100 км.

    public Engine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public Engine() {
        this.typeEngine = typeEngine;
    }

    public boolean start(int amountOfGas) {

        boolean engineStart = false;
        if (amountOfGas > 0) {
            System.out.println("Engine on!!");
            engineStart = true;
        } else {
            System.out.println("Engine off, Gass off");
            engineStart = false;
        }
        return engineStart;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
