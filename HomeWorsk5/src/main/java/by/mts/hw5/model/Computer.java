package by.mts.hw5.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public String cpu;
    public String ram;
    public String ssd;
    public int cycleResource = 10;

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", cycleResource=" + cycleResource +
                '}';
    }

    public void on() {

        int i = 0;
        System.out.println("Warrning!!! Please enter 0 or 1");
        Scanner console = new Scanner(System.in);
        int enterNamber = console.nextInt();
        Random random = new Random();
        if (enterNamber == random.nextInt(1)) {
            System.out.println("Computer off");
        } else {
            System.out.println("Computer destroyed");

        }
    }
}
