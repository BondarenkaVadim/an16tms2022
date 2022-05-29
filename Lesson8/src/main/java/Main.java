public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        {
            Animal nobody = new Dog("Kto-to");
            animals[0] = nobody;
        }

        {
            Cat cat = new Cat("Murka");
            animals[1] = cat;
        }
        {
            Cow cow = new Cow("Grasha");
            animals[2] = cow;
        }
        {
            Cow cow2 = new Cow("Dasha");
            animals[3] = cow2;
        }
        {
            Dog dog = new Dog("Bobic");
            animals[4] = dog;
        }

        System.out.println("___________");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].info());
        }

    }
}
