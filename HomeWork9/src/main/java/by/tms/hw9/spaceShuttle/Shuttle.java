package by.tms.hw9.spaceShuttle;

import java.util.Random;

public class Shuttle implements IStart {
    @Override
    public boolean prelaunchСheck() {
        Random random = new Random();
        int x = random.nextInt(11);
        if (x > 3) {
            System.out.println(x);
            return true;
        } else {
            System.out.println(x);
            return false;
        }
    }

    @Override
    public void engineStarting() {
        System.out.println("Engine Shuffle on.\n" +
                "All systems are ok.");
    }

    @Override
    public void start() {
        System.out.println("Shattle Start");
    }
}
