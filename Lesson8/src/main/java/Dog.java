public class Dog extends Animal {
    final String speak = "gaf";
    final String speak2 = "ufff";

    public Dog(String name) {
        super(name);
    }
    @Override
    public String info() {
        return getName() +" "+ speak +" " + speak2;
    }
}
