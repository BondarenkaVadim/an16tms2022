package by.tms.hw5.person.main;

public class Main {
    public static void main(String[] args) {

        User testUser = new User(55);  // если 55 лет то пожилой мужчина
        testUser.setFirstName("Ivanov");
        //testUser.firstName = "";
        testUser.setLastName("Ivan");
        testUser.setSex("Men");

        User testUser2 = new User("Girl", 20);

        User user = new User();
        user.setFirstName("Bondarenko");
        user.setLastName("Dima");
        user.setAge(3);
        user.setSex("Men");
        String str;
   //     user.conditionExamination(Integer.parseInt("33"));
        user.setCondition(user.conditionExamination(Integer.parseInt("3")));


        user.increaseAge();
        user.fullLastName();
        System.out.println(testUser2);
        System.out.println("_____________-");
        System.out.println(testUser);
        System.out.println("______");
        System.out.println(user);



    }
}
