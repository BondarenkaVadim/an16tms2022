import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Dog implements Speaker{
    private final String name;
    @Override
    public void speak() {
        System.out.println("Speal" + name);
    }
}
