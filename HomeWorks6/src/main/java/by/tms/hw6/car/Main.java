package by.tms.hw6.car;

public class Main {
    public static void main(String[] args) {
        boolean st;
        int amountOfGas = 50;
        GasTank lit = new GasTank();
        lit.setAmountOfGas(amountOfGas);

        Engine engine = new Engine();
        Car car = new Car();
        st = engine.start(lit.getAmountOfGas());


        System.out.println(car.distans(st, amountOfGas));
        System.out.println("Total mileage " + car.getMileage());
    }
}
