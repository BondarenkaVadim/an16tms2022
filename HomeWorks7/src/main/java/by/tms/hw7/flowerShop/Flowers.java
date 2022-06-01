package by.tms.hw7.flowerShop;


public enum Flowers {
    ROSE ("rose", 15), LILY("lily", 7), ASTER("aster", 5), HERBERA ("herbera", 5), TULIP ("tulip", 8), CARNATION ("carnation", 11);
    final private String name;
    final private int price;

    Flowers(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
