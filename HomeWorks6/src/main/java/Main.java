import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //PersonRegistry[] arrayPeople = new PersonRegistry[5];

        Person peopleVadim = new Person();
        peopleVadim.setName("Vadim");
        peopleVadim.setAge(33);
        peopleVadim.setSex("Men");
        Address addressVadim = new Address("Bel", "Minsk");
        peopleVadim.setAdress(addressVadim);


        Person peopleDima = new Person();
        peopleDima.setName("Dmitrii");
        peopleDima.setAge(37);
        peopleDima.setSex("Men");
        Address addressDima = new Address("Bel", "Minsk");
        peopleDima.setAdress(addressDima);

        Person peopleLiza = new Person();
        peopleLiza.setName("Liza");
        peopleLiza.setAge(32);
        peopleLiza.setSex("Girl");
        Address addressLiza = new Address("Bel", "Pinsk");
        peopleLiza.setAdress(addressLiza);
        System.out.println(addressLiza);

        Person[] arrayPerson = {peopleVadim, peopleDima, peopleLiza};
        System.out.println("-------------");
        System.out.println(Arrays.toString(arrayPerson));
        System.out.println(arrayPerson[0].getName());

        PersonRegistry pr = new PersonRegistry(arrayPerson);

        MilitaryOffice mo = new MilitaryOffice(pr);

        System.out.println("%%%%%%%%%%%%");
        System.out.println(mo.findCountPersonByName("Liza"));  // количество людей с именем Лиза
        System.out.println(mo.findCountPersonByCity("Minsk"));




        //PersonRegistry pr = new PersonRegistry();
        //System.out.println(pr.person2.getName());
//PersonRegistry pr  = new PersonRegistry();
//pr.setPeople("Aler", 18, "Men", "BLR", "Mbyc");
    }
}
