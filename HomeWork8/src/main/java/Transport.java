import lombok.*;

@Getter
@Setter
@NoArgsConstructor // конструктор без параметров
@AllArgsConstructor // конструктор со всеми параметрами
@ToString // toString

abstract class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

    public String info() {
        return "Power: " + " " + power + " MaxSpeed: " + maxSpeed + " Weight: " + weight + " Brand: " + brand;
    }

    protected double kilowattPower() {  // protected видит только наследование классы
        return 0.74 * power;              // defolt только в пакете
    }

}
