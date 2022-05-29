package by.tms.hw7.seasons;

public enum Seasons {
    WINTER("Cold", -10), SPRING("Hope for warmth", 5), SUMMER("Warm", 25), AUTUMN("disgusting", 10);
    private String info;
    private int averageTemperature;


    Seasons(String info, int averageTemperature) {
        this.info = info;
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    public void method(Seasons mySeason) {
        switch (mySeason) {
            case AUTUMN -> {
                System.out.println("I like " + Seasons.AUTUMN);
                break;
            }
            case WINTER -> {
                System.out.println("I like " + Seasons.WINTER);
                break;
            }
            case SPRING -> {
                System.out.println("I like " + Seasons.SPRING);
                break;
            }
            case SUMMER -> {
                System.out.println("I like! " + Seasons.SUMMER);
                System.out.println(Seasons.SUMMER.getDescription());
                break;
            }

        }
    }

//    public String getDescription(Seasons saeson) {
//        Seasons seasons = null;
//        return saeson.getInfo().toString();
//    }


    public String getDescription() {
        return "Cold season";
    }

}
