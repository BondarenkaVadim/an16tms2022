public class Main {
    public static void main(String[] args) {
        int i1 = Helper.sum(12,134);
        System.out.println(i1);
        Person [] people = new Person[3];
        {
            // если поля prived
            Person person = new Person("Ivan", 18);
         //   person.name = "Ivan";
          //  person.age = 18;
            people[0] = person;
        }
        {
            Person person = new Person();
            person.setName("Vadim");
           //или так
            // person.name = "Vadim";
            person.setAge(33);
            //person.age = 33;
            people[1] = person;
            System.out.println(person.getName());
        }
        //  if (Person.MY_TEMP.equals(args[0])){
        //      System.out.println("ok");
        //   }
        // Person ivan = new Person("iVAN", 15);
        //   ivan.address = new Address("BLR", "Minsk");
        for (int i = 0; i < 2; i++) {


            System.out.println(people[i]);
        }
        int sum = Helper.sum(12,134);
        System.out.println(sum);
        System.out.println(Person.getCounter());
        //Helper helper = new Helper();
        //helper.sum(0, 6);
    }
}
