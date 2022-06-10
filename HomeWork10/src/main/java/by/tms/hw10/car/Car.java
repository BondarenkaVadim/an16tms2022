package by.tms.hw10.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car {
    private String brand;
    private int speed;
    private int price;


    public void start() throws CustomCarException {

        Random random = new Random();
        int x = random.nextInt(21) + 1;
        if (x % 2 == 0) {
            System.out.println(x + " You Car " + brand + " is ON");;
        } else {
            throw new CustomCarException(x + " You Car " + brand + " is OFF");
        }
    }


}

