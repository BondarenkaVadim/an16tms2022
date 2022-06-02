package by.tms.hw9.human.pants;

public class LevisPants implements IPants{
    private int price;

    public LevisPants(int price) {
        this.price = price;
    }

    public LevisPants() {
    }

    @Override
    public void dress() {
        System.out.println("Levise pants are on");
    }

    @Override
    public void takeOff() {
        System.out.println("Levise pants off");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
