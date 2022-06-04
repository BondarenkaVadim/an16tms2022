package by.tms.hw9.human.shoes;

public class HMShoes implements IShoes{
    private int price;

    public HMShoes(int price) {
        this.price = price;
    }

    public HMShoes() {
    }

    @Override
    public void dress() {
        System.out.println("Wear H&M shoes");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off your H&M shoes");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
