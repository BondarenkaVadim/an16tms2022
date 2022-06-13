import java.io.*;
import java.util.Arrays;

public class Main {
    public static final String INPUT_FILE = "c:/works/TeachMeSkills/an16tms2022/HomeWork12/src/main/java/by/tms/hw12/hw1/input.txt";
    public static final String OUTPUT_FILE = "c:/works/TeachMeSkills/an16tms2022/HomeWork12/src/main/java/by/tms/hw12/hw1/output.txt";

    public static void main(String[] args) throws IOException {

        //String contents = readUsingBufferedReader(INPUT_FILE);
        StringBuilder contents = new StringBuilder(readUsingBufferedReader(INPUT_FILE));
       System.out.println(contents);

    }

    // считываем содержимое файла в String с помощью BufferedReader
    private static String readUsingBufferedReader(String INPUT_FILE) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
    //    String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            StringBuilder sBarr = new StringBuilder(line);
            if (line.equals(sBarr.reverse().toString())) {
                stringBuilder.append(line); // добавить разделитель
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }


}
