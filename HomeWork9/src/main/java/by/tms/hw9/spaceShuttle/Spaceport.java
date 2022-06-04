package by.tms.hw9.spaceShuttle;

public class Spaceport extends Shuttle {
    @Override
    public boolean prelaunchСheck() {
        return super.prelaunchСheck();
    }

    @Override
    public void engineStarting() {
        super.engineStarting();
    }

    @Override
    public void start() {
        super.start();
    }

    public void startShatl() {
        if (prelaunchСheck()) {
            engineStarting();
            System.out.println("3,2,1");
            start();
        } else
            System.out.println("Fail");
    }
}
//    public static void main(String[] args) {
//
//        Shuttle shuttle = new Shuttle();
//
//        if (shuttle.prelaunchСheck()){
//            shuttle.engineStarting();
//            System.out.println("3,2,1");
//            shuttle.Start();
//        } else
//            System.out.println("Fail");
//    }
//}
