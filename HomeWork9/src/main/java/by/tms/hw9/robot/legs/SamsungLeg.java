package by.tms.hw9.robot.legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Steps away from Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
