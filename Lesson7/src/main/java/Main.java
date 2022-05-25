public class Main {
    public static void main(String[] args) {

        SimpleAddress simpleAddress = new SimpleAddress();
        simpleAddress.setStreet("Mira");
        simpleAddress.setCity("Minsk");
        simpleAddress.setCountry("BLR");
        System.out.println(simpleAddress);
        System.out.println(simpleAddress.getCountry());

        System.out.println(DayOfweek.SUNDAY);
    }
}
