import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Person implements Speaker, Cloneable, Comparable {//+ =  Cloneable - маркер интерфейс не имеющие методов
    private final String name;
    @Override
    public void speak() {
        System.out.println("Person "+ name);
    }


    @Override
    public int compareTo(Object o) {  // обджект базовый класс
        Person person = (Person) o;   // приводим с обжекта к типу Person
        return name.compareTo(person.name);
    }
}
