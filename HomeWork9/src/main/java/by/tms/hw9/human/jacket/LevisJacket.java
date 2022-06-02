package by.tms.hw9.human.jacket;

public class LevisJacket implements IJacket {
    private int price;

    public LevisJacket(int price) {
        this.price = price;
    }

    public LevisJacket() {
    }

    @Override
    public void dress() {
        System.out.println("Wearing a jacket Levis");
    }

    @Override
    public void takeOff() {
        System.out.println("Jacket removed Levis");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
