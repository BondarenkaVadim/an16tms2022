package by.tms.hw9.human.jacket;

public class HMJacket implements IJacket {
    private int price;

    public HMJacket(int price) {
        this.price = price;
    }

    public HMJacket() {
    }

    @Override
    public void dress() {
        System.out.println("Wearing a jacket H&M");
    }

    @Override
    public void takeOff() {
        System.out.println("Jacket removed H&M");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
