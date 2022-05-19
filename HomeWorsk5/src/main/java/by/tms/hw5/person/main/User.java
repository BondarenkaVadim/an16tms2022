package by.tms.hw5.person.main;

public class User {


    public String firstName;

    public String lastName;
    public int age;
    public String sex;
    public String condition;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }

    public User() {

    }

    User(int s) {
        this.age = s;
        if (s >= 30) {
            condition = "Old";
        } else {
            condition = "Young";

        }
    }

    User(String s) {

        User u = new User(20); //если 20 лет то девочка, молодая
        if (u.age <= 25) {
            this.sex = s;
            this.age = u.age;
            this.lastName = "Vera";
            this.firstName = "Ivanova";
            this.condition = u.condition;
        } else {
            this.sex = "Men";
            this.age = u.age;
            this.condition = u.condition;
            this.lastName = "Igor";
            this.firstName = "Ivanov";
        }
    }


    @Deprecated
    public void fullLastName() {   // изменениие имени на польное
        if (this.lastName == "Dima") {
            this.lastName = "Dmitii";
        }
    }

    public void ageIncrease() {   // увеличение возраста на 1
        this.age = this.age + 1;
    }
}
