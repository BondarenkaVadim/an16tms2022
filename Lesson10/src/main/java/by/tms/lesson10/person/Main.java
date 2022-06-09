package by.tms.lesson10.person;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Alex", 30, new Address("Minsk"));
        //Person person2 = new Person("Alex", 30, new Address("Minsk"));

        Object person2 = person1.clone();

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
