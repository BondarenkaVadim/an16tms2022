import java.util.Scanner;


public class HomeWorks_3 {
    public static void main(String[] args) {
        englishLitters();
        parityСheck();
        modulNambers();


        final int max = 28800;
        final int rnd = rnd(max);
        System.out.println("В секундах " + rnd);
        System.out.println("В часах " + rnd / 60 / 60);


        int[] temp = {1, 2, 30, 4, 11};
        System.out.println("average array" + average(temp));
        System.out.println("max array " + max(temp));
    }

    public static void englishLitters() {
        char litters;
        for (int i = 97; i < 123; i++) {
            litters = (char) i;
            System.out.println(litters);
        }
        for (int i = 65; i < 91; i++) {
            litters = (char) i;
            System.out.println(litters);
        }
    }

    public static void parityСheck() {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        if ((str.contains(".")) || (str.contains(","))) {
            System.out.println("VVedeno nevernoe chislo");

        } else {

            int namber = Integer.parseInt(str);
            if (namber % 2 == 0) {
                System.out.println("Chislo chetnoe");
            } else {
                System.out.println("Chislo ne chetnoe");
            }
        }

    }

    public static void modulNambers() {
        Scanner console = new Scanner(System.in);
        double[] arrayDouble = new double[3];
        for (int i = 0; i < 3; i++) {
            arrayDouble[i] = console.nextDouble();
        }
        double modulMin = arrayDouble[0];
        for (int i = 1; i < 3; i++) {
            if (Math.abs(modulMin) > Math.abs(arrayDouble[i])) {
                modulMin = arrayDouble[i];
            }
        }
        System.out.println(modulMin);
    }


    public static int rnd(int max) {
        return (int) (Math.random() * ++max);
    }

    public static double average(int[] array) {
        double srednee = 0;
        for (int i = 0; i < array.length; i++) {
            srednee = srednee + array[i];
        }
        return (srednee / array.length);
    }


    public static int max(int[] array) {
        int maxNamber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxNamber < array[i]) {
                maxNamber = array[i];
            }
        }
        return (maxNamber);

    }
}
