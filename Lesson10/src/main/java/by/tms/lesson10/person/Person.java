package by.tms.lesson10.person;

import lombok.*;

import java.util.Objects;
@EqualsAndHashCode()
@AllArgsConstructor // конструктор со всеми параметрами

public class Person implements Cloneable{
    private String name;
    private int age;
    private Address address;

    @Override
    protected Person clone() throws CloneNotSupportedException {  // Возвращаем тип Object
        Person personClone = (Person) super.clone();
        personClone.address = address.clone(); // проверить
        return personClone;                                     // если есть необходимость можем возвращать любой тип
                                                                    //return (Person) super.clone()
    }
}
