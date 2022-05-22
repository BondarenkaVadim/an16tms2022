public class Address {
    public String sity;
    public String counrty;

    {


    }
    public Address(String sity, String counrty) {
        this.sity = sity;
        this.counrty = counrty;
    }

    class Inner{
        private String name;

        public Inner(String name) {
            this.name = name;
        }
    }
}
