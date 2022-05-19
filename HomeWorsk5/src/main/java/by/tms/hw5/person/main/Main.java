package by.tms.hw5.person.main;

public class Main {
    public static void main(String[] args) {

        User testUser = new User(55);  // если 55 лет то пожилой мужчина
        testUser.firstName = "IvanovOld";
        testUser.lastName = "IvanOld";
        testUser.sex = "Men";

        User testUser2 = new User("Girl");

        User user = new User();
        user.firstName = "Bondarenko";
        user.lastName = "Dima";
        user.age = 33;
        user.sex = "Men";


        user.ageIncrease();
        user.fullLastName();
        System.out.println(testUser2);
        System.out.println("_____________-");
        System.out.println(testUser);
        System.out.println("______");
        System.out.println(user);

        System.out.println("_____________________");


    }
}
