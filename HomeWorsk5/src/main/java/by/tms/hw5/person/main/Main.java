package by.tms.hw5.person.main;

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
