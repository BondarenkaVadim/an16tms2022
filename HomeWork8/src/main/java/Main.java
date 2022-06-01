import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PassengerCar pc = new PassengerCar();
        pc.setBrand("Audi");
        pc.setTypeCar("Sportback");
        pc.setNumberOfPassengers(2);
        pc.setFuelConsumption(15); // расход топлива
        pc.setPower(400);
        pc.setMaxSpeed(350);
        pc.setWeight(2500); // масса
        pc.setWheelCount(4);
        System.out.println(pc.info());
        System.out.println("------------");
        System.out.println(pc.kilowattPower());
        System.out.println("------------");
        Scanner console = new Scanner(System.in);
        pc.text(console.nextDouble());

        FreightCar fc = new FreightCar();
        fc.setLoadCapacity(1000);
        fc.capacity(900);

        СivilTransport ct = new СivilTransport();
        ct.setNumberOfPassengers(120);
        ct.loadPassengers(1000);


        MilitaryTransport mt = new MilitaryTransport();
        mt.setNumberOfRockets(10);
        mt.setEjection(false);
        mt.rocketLaunch();
        mt.catapult();
    }
}
