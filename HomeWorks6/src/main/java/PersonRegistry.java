public class PersonRegistry {

    Person[] people = new Person[10];
    Address addresperson1 = new Address("Bel", "Minsk");
    Person person1 = new Person("Vadim", 33, "Men", addresperson1);

    Address addresperson2 = new Address("Bel", "Minsk");
    Person person2 = new Person("Alessandr", 25, "Men", addresperson1);

    Address addresperson3 = new Address("Bel", "Grodno");
    Person person3 = new Person("Aleksanddr", 40, "Men", addresperson1);

    Address addresperson4 = new Address("Ger", "Berlin");
    Person person4 = new Person("Dmitrii", 15, "Men", addresperson1);


}
