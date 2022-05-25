import java.util.Arrays;

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

    public Person[] getRecruits() {
        Person[] recruits = new Person[people.length];
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];

            if ((person.getAge() > 18)&&(person.getAge() < 27)&& person.getSex().getMyName().equals("Men")) {
                recruits[i] = person;
            }
        }

        //новый массив без null
        int count = 0;
        for (int i = 0; i < recruits.length; i++) {
            if (recruits[i] != null)
                count ++;
        }
        Person[] recruitsWhihNull = new Person[count];
        int id = 0;
        for (int i = 0; i < recruits.length; i++) {
            if (recruits[i] != null) {
                recruitsWhihNull[id] = recruits[i];
                id++;
            }
        }

        return recruitsWhihNull;
    }
}


