package by.tms.hw7.flowerShop;

import java.util.Arrays;

public class Bouquet {
    //+ =
    private Flowers[] flowers;
    public static int oldCost= 0;

    public Bouquet(Flowers[] flowers) {
        this.flowers = flowers;
    }

    public void priceBouquet(Flowers[] flowers) {
        int cost = 0;
        for (int i = 0; i < flowers.length; i++) {
            cost = cost + flowers[i].getPrice();

        }
        oldCost = oldCost + cost;
        System.out.println(cost);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + Arrays.toString(flowers) +
                '}';
    }
}
