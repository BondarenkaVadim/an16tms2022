import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
Person [] arrayPeople = new Person[3];
        PersonRegistry personRegistry = new PersonRegistry(arrayPeople);
       // MilitaryOffice militaryOffice = new MilitaryOffice()

        Person peopleVadim = new Person();
     //   peopleVadim.setName("Vadim");
      //  peopleVadim.setAge(33);
      //  peopleVadim.setSex("Men");
      //  Address addressVadim = new Address("Bel", "Minsk");
      //  peopleVadim.setAdress(addressVadim);
            {
                    Person people = new Person("Liza", 32, "Girl", new Address("Bel", "Pinsk"));
                    arrayPeople[0] = people;
            }
        {
                Person people = new Person("Dmitrii", 37, "Men", new Address("Bel", "Mins"));
                arrayPeople[1] = people;
        }
            {
                    Person people = new Person("Vadim", 33, Sex.FEMEN, new Address("BLR", "Grodno"));
                    arrayPeople[2] = people;
            }

        //peopleDima.setName("Dmitrii");
        //peopleDima.setAge(37);
        //peopleDima.setSex("Men");
        //Address addressDima = new Address("Bel", "Minsk");
       // peopleDima.setAdress(addressDima);




      //  Person[] arrayPerson = {peopleVadim, peopleDima, peopleLiza};
        System.out.println("-------------");
        System.out.println(Arrays.toString(arrayPeople));
    //    System.out.println(arrayPerson[0].getName());

        PersonRegistry pr = new PersonRegistry(arrayPeople);

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
