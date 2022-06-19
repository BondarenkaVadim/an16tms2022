import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1L, "Ivan", 25));
        personList.add(new Person(2L, "Vadzim", 33));
        personList.add(new Person(2L, "Liza", 32));

        System.out.println(personList);

//        personList.sort(new Comparator<Person>() { //сортировака по возрастанию
//            // если нужно по убыванию о1 и о2 поменять местами
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getMane().compareTo(o2.getMane());
//            }
//        });
//        Collections.sort(personList);  // второй способ сортировки

        Set<Person> hashSet = new HashSet<>(personList);
        System.out.println(hashSet);
        Set<Person> treeSet = new TreeSet<>(personList);
        System.out.println(treeSet);
       // System.out.println(personList);
    }
}
