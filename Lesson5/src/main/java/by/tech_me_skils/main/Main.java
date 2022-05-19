package by.tech_me_skils.main;

import by.tech_me_skils.model.Addres;
import by.tech_me_skils.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Nikolay";
        person.age = 12;
        person.heigth = 150;


        Addres addres = new Addres();
        addres.city = "Minsk";
        addres.country = "Belarus";
        addres.street = "Mira";

        person.addres = addres; // идет в person и из person в addres
        System.out.println(person);
    }
}
