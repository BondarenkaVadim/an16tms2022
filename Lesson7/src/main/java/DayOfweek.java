import by.tms.utils.Constans;

public class DayOfweek {
  //  void test(){
  //      Constans.SUNDAY  // или через константу или
  //  }
    private String name;

    private DayOfweek(String name) {
        this.name = name;
    }
    public static final DayOfweek SUNDAY = new DayOfweek("SUNDAY");

}
