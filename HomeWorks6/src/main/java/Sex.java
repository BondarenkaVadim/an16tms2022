import com.sun.source.tree.BreakTree;

public enum Sex {
    MEN("жужской"), FEMEN("женский");
    private String myName;

    Sex(String myName) {
        this.myName = myName;
    }
    public Sex parser (String value){
        return Sex.valueOf(value);
    }

}
