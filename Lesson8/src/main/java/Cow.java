import javax.xml.namespace.QName;

public class Cow extends Animal {
    final private String speak = "mu";

    public Cow(String name) {
        super(name);
    }

    @Override
    public String info() {
        return super.info() +" "+ speak;
    }
}

