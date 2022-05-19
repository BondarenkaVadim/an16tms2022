package by.tech_me_skils.model;

public class Person {
    //характеристики (свойства, поля) глобальная переменная
    public int age;
    public String name;
    public int heigth;
    public Addres addres;

    public Person() { //конструктор по умолчанию
        System.out.println("Constructor for Person");
        //тело
    }

    public Person(int age, java.lang.String name, int heigth, Addres addres) {
        this.age = age;
        this.name = name;
        this.heigth = heigth;
        this.addres = addres;
    }

    public void test(int value, String str) {
        this.age = 12;
        int age = 34;
        System.out.println(value + str + age + this.age); //this.age глобальная переменная, age локальная переменная
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "age=" + age +
                ", name=" + name +
                ", heigth=" + heigth +
                ", addres=" + addres +
                '}';
    }
}
