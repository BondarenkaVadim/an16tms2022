package by.tms.hw10.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.FileNotFoundException;
import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car {
    private String brand;
    private int speed;
    private int price;


    public static void start(String brand) throws CustomExceptionCar {

        Random random = new Random();
        int x = random.nextInt(21) + 1;
        if (x % 2 == 0) {
            throw new CustomExceptionCar(x + " You by.tms.hw10.car.Car " + brand + " is ON");
        } else {
            throw new CustomExceptionCar(x + " You by.tms.hw10.car.Car " + brand + " is OFF");
        }
    }


}

