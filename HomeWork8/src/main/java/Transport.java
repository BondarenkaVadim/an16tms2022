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
                return "Power: "  +" "+ power  +" MaxSpeed: "+ maxSpeed   +" Weight: "+ weight   +" Brand: "+ brand;
        }
        public double kilowattPower(){
                return 0.74*power;
        }
}
