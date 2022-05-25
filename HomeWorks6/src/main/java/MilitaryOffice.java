import java.util.Iterator;

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public int findCountPersonByName(String name) {

        Person [] people = personRegistry.getRecruits();  // логика в personRegistry фильтр на ...
        int count = 0;
        for (int i = 0; i < people.length; i++) {
                if (people[i].getName().equals(name)) {
                    count++;

            }
        }
        return count;
    }

    public int findCountPersonByCity(String sity) {
        Person [] people = personRegistry.getRecruits();
        int count = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAdress().getCity().equals(sity))
                count++;
        }
        return count;
    }
    public int findCountsPersonByAge(int ageMin, int ageMax){
        Person [] people = personRegistry.getRecruits();
        int count = 0;
        for (int i = 0; i < people.length; i++) {
            if ((people[i].getAge() >= ageMin)&& people[i].getAge() <= ageMax){
                count ++;
            }
        }
        return count;
    }

}
