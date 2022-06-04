package by.tms.hw9.human.shoes;

public class LouisVuttonShoes implements IShoes{
    private int price;

    public LouisVuttonShoes(int price) {
        this.price = price;
    }

    public LouisVuttonShoes() {
    }

    @Override
    public void dress() {
        System.out.println("Wear Louis Vutton shoes");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off your Louis Vutton shoes");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
