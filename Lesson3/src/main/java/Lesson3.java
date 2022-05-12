
public class Lesson3 {
    public static void main(String[] args) {

        //boolean b = true;
        // boolean result = !b ? 3 > 2 : 5 < 7;
        /*
        if (!b){
            result = 3>2;
        } esle {
            result = 5>7;
        }
            */
      /*  int mm = 8;
        mm += 2;
        System.out.println("привет");
        Random random = new Random();
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array = random.;
            }
            System.out.println();*/

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
        /*
        swinc
        case

        тернарная перация
         */
    }
}


