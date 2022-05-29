package by.tms.hw7.seasons;

public class Main {
    public static void main(String[] args) {
        //+
        Seasons mySeason = Seasons.SUMMER;

        System.out.println(mySeason.getInfo());
        mySeason.method(mySeason);
        System.out.println("__________");

        Seasons s;
        Seasons sArray[] = Seasons.values();
        for (Seasons a: sArray)
            System.out.println(a + " " + a.getInfo()+ " " + a.getAverageTemperature());



    }
}
