package by.tms.hw9.robot.heads;

public class SamsungHead implements IHead{
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }
    public SamsungHead(){

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
