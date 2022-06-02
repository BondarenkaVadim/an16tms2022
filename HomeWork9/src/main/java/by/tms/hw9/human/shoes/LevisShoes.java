package by.tms.hw9.human.shoes;

public class LevisShoes implements IShoes{
    private int price;

    public LevisShoes(int price) {
        this.price = price;
    }

    public LevisShoes() {
    }

    @Override
    public void dress() {
        System.out.println("Wear Levi's shoes");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off your Levi's shoes");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
