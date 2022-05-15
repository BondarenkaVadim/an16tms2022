import java.util.Arrays;
import java.util.Random;


public class Lesson4 {
    public static void main(String[] args) {

        int[] ints = new int[10];
        Random random = new Random();
        for (int j = 0; j < ints.length; j++) {
            ints[j] = random.nextInt(11); // от 0 до 10
        }
        //    ints = random.nextInt(11) + 10; // от 10 до 20
        //    ints = random.nextInt(21) - 10; // от -10 до 10
        int[] intsNew = new int[15];

        System.arraycopy(ints, 0, intsNew, 0, ints.length);//копировать массив
        System.out.println(Arrays.toString(intsNew)); // ввывод всего массива


        // Arrays.equals(temp, temp2) // сравнение массива
        Arrays.sort(intsNew); // сортировка массива (по возрастанию)
        System.out.println(Arrays.toString(intsNew));
        //_____________________________-
        /*
        switch ()
        case

        default

        тернарная операция
         */

        int[] mass = new int[3000];
        boolean b = true;
        for (int i = 0; i < mass.length && b; i += 3) {
            System.out.println("1");
            if (i == 3) {
                b = false;
            }
        }// 1 напечатает 2 раза
        /* бесконечный цикл
        for (; ; ){
         */
        /*
        }*/
        /*for (int i = 0; int j = 10;  i <j ; i++; j--) {
            System.out.println(i + " " + j);
        }
        */
        System.out.println("___________");
        kr();
        System.out.println("___________");
        int i = 100;
        int j = 200;
        while (i != j) {
            ++i;
            --j;
        }
        System.out.println(i + " " + j);
        System.out.println("-------------------");
        //или
    /*    while (true) {
            i++
            j--
            if (i == j) {
                break;
            }
        }
        //__________ или
        while (!(++i == --j )){
            System.out.println(i + " " + j);
        }*/


        int value = 0;
        System.out.println("ggg");
        Scanner
    }

    public static void kr() {
        for (int i = 0; i <= 100; i += 5) //{
            // if (i % 5 == 0) {
            System.out.print(i + " ");
        System.out.println("");
        //  } вывести числа кратные 5 оптимальной итерации

    }
}
