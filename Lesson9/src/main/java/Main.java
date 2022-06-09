import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Speaker person = new Person("Ivan");
        Speaker dog = new Dog("Bob");
        Speaker[] arraySpeaker = {person, dog};
        System.out.println(Arrays.toString(arraySpeaker));



        printSreaker(arraySpeaker);


    }

    private static void printSreaker(Speaker[] arraySpeaker) {
        for (Speaker speaker : arraySpeaker){   // бегаме по массив  и вызываем метод speak()
            speaker.speak();
        }
    }
}
