import lombok.*;

@Getter
@Setter
@NoArgsConstructor // конструктор без параметров
@AllArgsConstructor // конструктор со всеми параметрами
@ToString // toString

public class PassengerCar extends Ground {
    private String typeCar;
    private int numberOfPassengers;
    private double kmСalculation;


    @Override
    public String info() {
        return super.info() + " TypeCar: " + typeCar + " NumberOfPassengers: " + numberOfPassengers;
    }


    private double kmСalculation(double time) {
        kmСalculation = time * getMaxSpeed();
        return kmСalculation;
    }

    private double fuelСalculation() {
        return kmСalculation * getFuelConsumption() / 100;
    }

    public void text(double time) {
        System.out.println("During " + time + " h, car " + getBrand() +
                " moving at maximum speed " + getMaxSpeed() +
                " will pass " + kmСalculation(time) + " km and will use up " + fuelСalculation() + " litt full.");

    }

}
