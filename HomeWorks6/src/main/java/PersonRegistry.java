public class PersonRegistry {

    public Person[] people;


    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public PersonRegistry(Person[] people) {
        this.people = people;
    }

}
