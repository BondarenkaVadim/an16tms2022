import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final String DELIMITER = ",";
        //String не изменяемый тип, если мы добавляем что-то - это создание нового объекта
        String str = "Java";
        String str2 = "Java2";
        char[] chararray = str.toCharArray(); // массив чаров

        String s = String.valueOf(12);   // цифру 12 запишем как ктроку
        System.out.println(String.join(DELIMITER, "23", "45", "fdgdfg")); // разделитель при перечислении
        System.out.println(String.join(", ", "23", "45", "fdgdfg"));

        System.out.println(str.compareTo(str2));
        String[] art3 = {"j", "a", "v","a"};
        Arrays.sort(art3);
        System.out.println(Arrays.toString(art3));

        String atr5 = "abcdif";
        String atr6 = atr5.replace("a", "f");
        System.out.println(atr6);


        StringBuilder result = new StringBuilder();

       // String result = "";
        for (int i = 0; i < 1000000; i++) {
            result.append("a");  //StringBuilder позволяет оптимизировать память
          //  result +="a";  // тоже самое что и result = result +"a";
           // Thread.sleep(50); // задержка в 50 млс
        }
        System.out.println(result.toString());

        // StringBuffer отличается от StringBuilder - синхронизированный и потокобезопасен (метод синхронайз).
        //если работаем с потоком от StringBuffer



        //? она может быть а может и не быть
     }
}
