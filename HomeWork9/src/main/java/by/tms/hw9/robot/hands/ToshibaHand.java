package by.tms.hw9.robot.hands;

public class ToshibaHand implements IHand{
private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Toshiba hand up");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
