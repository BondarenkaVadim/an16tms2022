package by.tms.hw9.robot.legs;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Steps away from Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
