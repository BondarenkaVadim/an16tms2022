import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] arrayPeople = new Person[4];

        {
            Person people = new Person("VADIM", 10, Sex.FEMEN, new Address("Bel", "Pinsk"));
            arrayPeople[0] = people;
        }
        {
            Person people = new Person("VADIM", 20, Sex.MEN, new Address("Bel", "Minsk"));
            arrayPeople[1] = people;
        }
        {
            Person people = new Person("VADIM", 20, Sex.MEN, new Address("Bel", "Minsk"));
            arrayPeople[2] = people;
        }
        {
            Person people = new Person("VADIM", 33, Sex.MEN, new Address("BLR", "Grodno"));
            arrayPeople[3] = people;
        }


        PersonRegistry personRegistry = new PersonRegistry(arrayPeople);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        System.out.println("^^^^^^^^^^^^^^");
        System.out.println(Arrays.toString(personRegistry.getRecruits()));
        // System.out.println(militaryOffice.findCountsPersonByAge(25, 30));
        //System.out.println(militaryOffice.findCountPersonByName("VADIM"));
        //System.out.println(militaryOffice.findCountPersonByCity("Minsk"));
        //System.out.println("^^^^^^^^^^^^^^");

    }
}
