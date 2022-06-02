import lombok.*;

@Getter
@Setter
@NoArgsConstructor // конструктор без параметров
@AllArgsConstructor // конструктор со всеми параметрами
@ToString // toString

public class FreightCar extends Ground {
    private int loadCapacity;


    @Override
    public String info() {
        return super.info() + " LoadCapacity: " + loadCapacity;
    }

    public void capacity(int cargo) {
        if (loadCapacity > cargo) {
            System.out.println("Truck loaded");
        } else {
            System.out.println("You need a bigger truck");
        }
    }
}
