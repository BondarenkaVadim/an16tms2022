public class Person {
    //Public, Private, Protected, Default
    // defauls видимость только внутри пакета
    // Protected через наследование
    private String name;
    private int age;
    private static int counter;

    public static final String MY_TEMP = "c:\\temp"; // константа. final - нельзя изменять

    {
        System.out.println("Bloc inicialization");
    }

    Address address = new Address("Minsk", "BLR");

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
        counter++;
    }

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

    public static int getCounter() {
        return counter;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }
}
