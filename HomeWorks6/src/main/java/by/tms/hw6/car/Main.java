package by.tms.hw6.car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi", "Black", new Engine("DVC", 10), new GasTank(100, 50));
        System.out.println(car.getMileage());
        car.startEngine();
        System.out.println(car.distans());
        System.out.println(car.getMileage());

        System.out.println("____________");
        Car car2 = new Car("Audi", "Black", new Engine("DVC", 10), new GasTank(100, 0));
        car2.startEngine();

    }
}
