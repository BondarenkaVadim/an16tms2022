package by.tms.hw9.spaceShuttle;

import java.util.Random;

public class Shuttle implements IStart {
    @Override
    public boolean prelaunchСheck() {
        Random random = new Random();
        int x = random.nextInt(11);

        System.out.println(x);
        return x > 3;

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
