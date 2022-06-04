import lombok.*;

@Getter
@Setter
@NoArgsConstructor // конструктор без параметров
@AllArgsConstructor // конструктор со всеми параметрами
@ToString // toString

public class СivilTransport extends Air {
    private int numberOfPassengers;
    private boolean businessClass;

    @Override
    public String info() {
        return super.info() + " numberOfPassengers: " + numberOfPassengers + " businessClass: " + businessClass;
    }

    public void loadPassengers(int passengers) {
        if (numberOfPassengers > passengers) {
            System.out.println("The plane is loaded");
        } else {
            System.out.println("You need a bigger plane");
        }
    }
}
