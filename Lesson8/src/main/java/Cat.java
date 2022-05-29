public class Cat extends Animal{
    final String speak = "mi";

    public Cat(String name) {
        super(name);
    }

    @Override
    public String info() {
        return getName()  +" "+ speak;
    }
}
