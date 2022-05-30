import lombok.*;

@Getter
@Setter
@NoArgsConstructor // конструктор без параметров
@AllArgsConstructor // конструктор со всеми параметрами
@ToString // toString

public class MilitaryTransport extends Air{
    private boolean ejection;
    private int numberOfRockets;

    @Override
    public String info() {
        return super.info()   +" Ejection: "+ ejection   +" NumberOfRockets: "+ numberOfRockets;
    }

    public void rocketLaunch(){
        if (numberOfRockets > 0){
            System.out.println("Rocket launched");
        } else {
            System.out.println("Rocket is off");
        }
    }
    public void catapult(){
        if (ejection){
            System.out.println("The ejection was successful");
        }else{
            System.out.println("You dont have such a system");
        }

    }


}
