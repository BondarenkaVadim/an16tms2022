package by.tms.hw7.flowerShop;

public class Main {
    //+ =
    public static void main(String[] args) {
        {
            Flower[] flowersFormBouquet1 = new Flower[]{Flower.CARNATION, Flower.CARNATION};
            Bouquet b1 = new Bouquet(flowersFormBouquet1);
            b1.priceBouquet(flowersFormBouquet1);
        }
        {
            Flower[] flowersFormBouquet = new Flower[]{Flower.HERBERA, Flower.CARNATION};
            Bouquet bouquet = new Bouquet(flowersFormBouquet);
            bouquet.priceBouquet(flowersFormBouquet);
        }
        {
            Flower[] flowersFormBouquet = new Flower[]{Flower.ROSE, Flower.LILY};
            Bouquet bouquet = new Bouquet(flowersFormBouquet);
            bouquet.priceBouquet(flowersFormBouquet);
        }
        {
            Flower[] flowersFormBouquet = new Flower[]{Flower.TULIP, Flower.TULIP};
            Bouquet bouquet = new Bouquet(flowersFormBouquet);
            bouquet.priceBouquet(flowersFormBouquet);
        }
        {
            Flower[] flowersFormBouquet = new Flower[]{Flower.TULIP, Flower.TULIP, Flower.CARNATION, Flower.CARNATION};
            Bouquet bouquet = new Bouquet(flowersFormBouquet);
            bouquet.priceBouquet(flowersFormBouquet);
        }

        System.out.println(Bouquet.oldCost);

    }
}
