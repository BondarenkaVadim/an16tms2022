package by.tms.hw9.robot.heads;

public class SonyHead implements IHead{

    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speek() {
        System.out.println("Speek head Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
