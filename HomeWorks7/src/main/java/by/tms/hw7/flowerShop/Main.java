package by.tms.hw7.flowerShop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    //+ =
    public static void main(String[] args) {
        {
            Flowers[] flowersFormBouquet1 = new Flowers[]{Flowers.CARNATION, Flowers.CARNATION};
            Bouquet b1 = new Bouquet(flowersFormBouquet1);
            b1.priceBouquet(flowersFormBouquet1);
        }
        {
            Flowers[] flowersFormBouquet = new Flowers[]{Flowers.HERBERA, Flowers.CARNATION};
            Bouquet bouquet = new Bouquet(flowersFormBouquet);
            bouquet.priceBouquet(flowersFormBouquet);
        }
        {
            Flowers[] flowersFormBouquet = new Flowers[]{Flowers.ROSE, Flowers.LILY};
            Bouquet bouquet = new Bouquet(flowersFormBouquet);
            bouquet.priceBouquet(flowersFormBouquet);
        }
        {
            Flowers[] flowersFormBouquet = new Flowers[]{Flowers.TULIP, Flowers.TULIP};
            Bouquet bouquet = new Bouquet(flowersFormBouquet);
            bouquet.priceBouquet(flowersFormBouquet);
        }
        {
            Flowers[] flowersFormBouquet = new Flowers[]{Flowers.TULIP, Flowers.TULIP, Flowers.CARNATION, Flowers.CARNATION};
            Bouquet bouquet = new Bouquet(flowersFormBouquet);
            bouquet.priceBouquet(flowersFormBouquet);
        }

        System.out.println(Bouquet.oldCost);

    }
}
