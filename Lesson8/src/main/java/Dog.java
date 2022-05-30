public class Dog extends Animal {
    final private String speak = "gaf";
    final private String speak2 = "ufff";

    public Dog(String name) {
        super(name);
    }
    @Override
    public String info() {
        return getName() +" "+ speak +" " + speak2;
    }
}
