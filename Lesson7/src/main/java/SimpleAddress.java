import lombok.*;

@Getter
@Setter
@NoArgsConstructor // конструктор без параметров
@AllArgsConstructor // конструктор со всеми параметрами
@ToString // toString
public class SimpleAddress {
    private String city;
    private String country;
    private String street;


}
