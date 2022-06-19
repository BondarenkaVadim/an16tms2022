import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String INPUT_FILE_HW1 = "c:/works/TeachMeSkills/an16tms2022/HomeWork12/src/main/java/by/tms/hw12/hw1/input.txt";
    public static final String OUTPUT_FILE_HW1 = "c:/works/TeachMeSkills/an16tms2022/HomeWork12/src/main/java/by/tms/hw12/hw1/output.txt";
    public static final String OUTPUT_FILE_HW2 = "c:/works/TeachMeSkills/an16tms2022/HomeWork12/src/main/java/by/tms/hw12/hw2/output.txt";
    public static final String INPUT_FILE_HW2 = "c:/works/TeachMeSkills/an16tms2022/HomeWork12/src/main/java/by/tms/hw12/hw2/input.txt";

    public static final String INPUT_FILE_HW3 = "c:/works/TeachMeSkills/an16tms2022/HomeWork12/src/main/java/by/tms/hw12/hw3/input.txt";
    public static final String INPUT_FILE_BLACK_LIST = "c:/works/TeachMeSkills/an16tms2022/HomeWork12/src/main/java/by/tms/hw12/hw3/blackList.txt";

    public static void main(String[] args) throws IOException {


        StringBuilder contents = new StringBuilder(readUsingBufferedReader());
//       System.out.println(contents);

        StringBuilder stringBuilder = new StringBuilder(readUsingBufferedReader_HW2());
//        System.out.println(stringBuilder);

        //запись в файл
        writer(OUTPUT_FILE_HW1, contents);
        writer(OUTPUT_FILE_HW2, stringBuilder);


        StringBuilder text = new StringBuilder(readText(INPUT_FILE_HW3));
        StringBuilder blackList = new StringBuilder(readText(INPUT_FILE_BLACK_LIST));

        String[] arrayBlackList = blackList.toString().split("\n");
        String[] arrayText = text.toString().split("\n");
        int count = 0;
        for (int i = 0; i < arrayText.length; i++) {
            for (int j = 0; j < arrayBlackList.length; j++) {
                if (arrayText[i].contains(arrayBlackList[j])) {
                    count++;
                    System.out.println(arrayText[i]);
                }else {
                    System.out.println("Sentence Chek ON");
                }
            }


        }

    }

    private static void writer(String OUTPUT_FILE, StringBuilder stringBuilder) {

        try (FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE, false)) {
            fileOutputStream.write(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
        } catch (Exception exception) {
            System.out.println("Unexpected error " + exception);
        }
    }


    // считываем содержимое файла в String с помощью BufferedReader
    private static String readUsingBufferedReader() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE_HW1));
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


    //правильнее сделать для обоих заданиях отдельно метод для чтения, и к обеим заданиям его вызвать и проверять
    private static String readUsingBufferedReader_HW2() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE_HW2));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("[A-Za-z]");
        while ((line = reader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find() && ((TextFormatter.countString(line) > 3) && (TextFormatter.countString(line) < 15) || (TextFormatter.checkPalindrome(line)))) {
                if (line.charAt(line.length() - 1) == '-') {

                    stringBuilder.append(line.substring(0, line.length() - 1));
                } else {
                    stringBuilder.append(line);
                    stringBuilder.append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }

    private static StringBuilder readText(String inputFiles) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFiles));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line); // добавить разделитель
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }


}
