import lombok.*;

@Getter
@Setter
@NoArgsConstructor // конструктор без параметров
@AllArgsConstructor // конструктор со всеми параметрами
@ToString // toString
abstract class Air extends Transport {
    private int wingspan;
    private int minRunwayStrip;

    @Override
    public String info() {
        return super.info() + " Wingspan: " + wingspan + " MinRunwayStrip: " + minRunwayStrip;
    }
}
