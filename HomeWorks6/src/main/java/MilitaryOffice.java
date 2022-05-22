public class MilitaryOffice {
    private PersonRegistry personRegistry;
   // public int findCountPersonByName(String name) {
    //}

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }
    public int findCountPersonByName(String name) {
        int count = 0;
        for (int i = 0; i < personRegistry.getPeople().length; i++) {
            if (personRegistry.people[i].getName().equals(name))
                count++;
        }
        return count;
        }
        public int findCountPersonByCity(String sity){
        int count = 0;
            for (int i = 0; i < personRegistry.getPeople().length; i++) {
                if (personRegistry.people[i].getAdress().getCity().equals(sity)&&(personRegistry.people[i].getAge()>18))
                    count++;
            }
            return count;
        }

}
