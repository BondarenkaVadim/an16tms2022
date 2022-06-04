package by.tms.hw9.human.pants;

public class LouisVuttonPants implements IPants {
    private int price;

    public LouisVuttonPants(int price) {
        this.price = price;
    }

    public LouisVuttonPants() {
    }

    @Override
    public void dress() {
        System.out.println("Louis Vutton pants are on");
    }

    @Override
    public void takeOff() {
        System.out.println("Louis Vutton pants off");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
