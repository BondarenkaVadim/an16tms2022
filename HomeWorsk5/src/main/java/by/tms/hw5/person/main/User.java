package by.tms.hw5.person.main;

public class User {


    private String firstName;

    private String lastName;
    private int age;
    private String sex;
    private String condition;

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

    public String conditionExamination (int s) {
        this.age = s;
        if (s >= 30) {
            condition = "Old";
            return "Old";
        } else {
            condition = "Young";
            return "Young";
        }
    }
    User (int s){
            this.age = s;
            if (s >= 30) {
                condition = "Old";
            } else {
                condition = "Young";
            }
        }

    User(String s, int ageI) {

       // User u = new User(20); //если 20 лет то девочка, молодая
        if (ageI <= 25) {

            this.sex = s;
            this.age = ageI;
            this.lastName = "Vera";
            this.firstName = "Ivanova";

            this.condition = conditionExamination(ageI);
        } else {
            this.sex = "Men";
            this.age = getAge();
            this.condition = condition;
            this.lastName = "Igor";
            this.firstName = "Ivanov";
        }
    }


    @Deprecated
    /*public void fullLastName() {   // изменениие имени на польное
        if (this.lastName.equals("Dima")) {
            this.lastName = "Dmitii";
        }
    }*/
    public String fullLastName() {   // изменениие имени на польное
        if ( this.lastName.equals("Dima")) {
            this.lastName = "Dmitii";
        }
        return this.lastName;
    }
    public String getFirstLastName(){
        return firstName + " " + lastName;
    }

    public void increaseAge() {   // увеличение возраста на 1
        this.age = this.age + 1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
