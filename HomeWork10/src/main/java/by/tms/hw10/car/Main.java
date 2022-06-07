package by.tms.hw10.car;

import by.tms.hw10.car.Car;
import by.tms.hw10.car.CustomExceptionCar;

public class Main {
    public static void main(String[] args) throws CustomExceptionCar, Exception {
        {
            Car car = new Car();
            car.setBrand("Audi");
            try {
                car.start(car.getBrand());
            } catch (CustomExceptionCar exception) {
                System.out.println(exception.getMessage());
            }
        }
        {
            Car car = new Car();
            car.setBrand("BMW");
            try {
                car.start(car.getBrand());
            } catch (CustomExceptionCar exception) {
                System.out.println(exception.getMessage());
            }
        }
        {
            Car car = new Car();

            car.setBrand("Mercedes");
            try {
                car.start(car.getBrand());
            } catch (CustomExceptionCar exception) {
                System.out.println(exception.getMessage());
            }
        }
        {
            Car car = new Car();
            car.setBrand("Volkswagen");
            try {
                car.start(car.getBrand());
            } catch (CustomExceptionCar exception) {
                System.out.println(exception.getMessage());
            }
        }


    }

}
