import lombok.*;

@Getter
@Setter
@NoArgsConstructor // конструктор без параметров
@AllArgsConstructor // конструктор со всеми параметрами
@ToString // toString

abstract  class Ground extends Transport{
    private int wheelCount;
    private int fuelConsumption;

    @Override
    public String info() {
        return super.info()   +" WheelCount: "+ wheelCount   +" FuelConsumption: "+ fuelConsumption;
    }
}
