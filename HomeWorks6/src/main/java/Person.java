
import lombok.*;

@NoArgsConstructor // конструктор без параметров
@AllArgsConstructor // конструктор со всеми параметрами
public class Person {
    private String name;
    private int age;
    private Sex sex;
    private Address adress;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", adress=" + adress +
                '}';
    }


}
