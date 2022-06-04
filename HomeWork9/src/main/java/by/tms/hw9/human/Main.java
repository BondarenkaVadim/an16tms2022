package by.tms.hw9.human;

import by.tms.hw9.human.jacket.HMJacket;
import by.tms.hw9.human.pants.LevisPants;
import by.tms.hw9.human.shoes.LouisVuttonShoes;

public class Main {
    public static void main(String[] args) {
        Human h = new Human("Ivan", new HMJacket(10), new LevisPants(20), new LouisVuttonShoes(50));
        h.getDressed();
        h.unDress();
        System.out.println(h.getPrice());

    }
}
