import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
            Sex sex = person.getSex();
            if ((person.getAge() >= 18) && (person.getAge() <= 27) && sex.equals(Sex.MEN)) {   //{person.getSex().getMyName().equals("Men")) {
                recruits[i] = person;
            }
        }

        //новый массив без null
        // как использовать System.arraycopy
        // мы ж должны не просто скопировать массив, а именно избавиться от null,
        // а они могут быть в массиве где угодно
        int count = 0;
        for (int i = 0; i < recruits.length; i++) {
            if (recruits[i] != null)
                count++;
        }
        Person[] recruitsWithoutNull = new Person[count];
        int id = 0;
        for (int i = 0; i < recruits.length; i++) {
            if (recruits[i] != null) {
                recruitsWithoutNull[id] = recruits[i];
                id++;
            }
        }

        return recruitsWithoutNull;

    }
}


