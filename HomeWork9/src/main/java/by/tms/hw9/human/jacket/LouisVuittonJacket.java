package by.tms.hw9.human.jacket;

public class LouisVuittonJacket implements IJacket {
    private int price;

    public LouisVuittonJacket(int price) {
        this.price = price;
    }

    public LouisVuittonJacket() {
    }

    @Override
    public void dress() {
        System.out.println("Wearing a jacket LouisVuitton");
    }

    @Override
    public void takeOff() {
        System.out.println("Jacket removed LouisVuitton");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
