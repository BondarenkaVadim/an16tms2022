import com.sun.source.tree.BreakTree;
import lombok.Getter;

@Getter
public enum Sex {
    MEN("Men"), FEMEN("Femen");
    private String myName;

    Sex(String myName) {
        this.myName = myName;
    }

    public Sex parser (String value){
        return Sex.valueOf(value);
    }

    @Override
    public String toString() {
        return "Sex{" +
                "myName='" + myName + '\'' +
                '}';
    }
}
