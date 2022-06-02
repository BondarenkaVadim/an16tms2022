package by.tms.hw9.human.pants;

public class HMPants implements IPants{
    private int price;

    public HMPants(int price) {
        this.price = price;
    }

    public HMPants() {
    }

    @Override
    public void dress() {
        System.out.println("H&M pants are on");
    }

    @Override
    public void takeOff() {
        System.out.println("H&M pants off");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
