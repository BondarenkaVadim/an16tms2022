
public class HomeWorks_2 {
    public static void main(String[] args) {
        //вывод на консоль
        printLiterals();
        //Некоторые тесты для проверки задач.
        System.out.println(sum(100, 200));
        //System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(calculateHypotenuse(3, 4));
    }

    private static void printLiterals() {
//        вывести на консоль литералы следующих видов:
//        логический
//        строковый
//        символьный
//        целочисленный 2-й
//        целочисленный 8-й
//        целочисленный 10-й
//        целочисленный 16-й
//        литерал типа float
//        литерал типа double.
        System.out.println(true + " " + "Hello" + " " + "a" + " " + 0b1101010110 + " " + 012314 + " " + 456 + " " + 0x141D12 + " " + 4.05E-13F + " " + 1.4);
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        long test_a = a;
        long test_b = b;
        if ((test_a + test_b) > Integer.MAX_VALUE){
            return -1;}
        else
        return a+b;
    }

    /**
     * Метод должен вернуть максимальное значение из двух чисел
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Метод должен вернуть 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Метод должен вернуть 10
     */
    public static int max(int a, int b) {
        if (a>b)
        return a;
        else
            return b;
    }

    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     * <p>
     * Example1:
     * 3
     * 4
     * return 5
     * <p>
     * Example2:
     * 12
     * 16
     * return 20
     */
    public static double calculateHypotenuse(int a, int b) {
        return (Math.sqrt(a*a+b*b));
    }
}