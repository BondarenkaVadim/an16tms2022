package by.tms.hw11.workingWithRegularExpressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //2 задание_____________________
        {
            String str = "cab, ccab, cccab";
            // но вот так со split проще )))
            // System.out.println(Arrays.toString(str.split(", ")));

            Pattern pattern = Pattern.compile("c+ab+");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println(str.substring(matcher.start(), matcher.end()));
            }

        }
        //3 задание_______________________
        //* 3) Дана строка "Versions:Java1, Java  5, Java 6, Java   7, Java 8, Java 12."  Найти все подстроки "Java X", где X - число и распечатать их.
        {
            //Java (\d)
            String str = "Versions:Java1 Java  5, Java 6, Java   7, Java 8, Java 12.";
            Pattern compile = Pattern.compile("Java(\\ *\\d+)");
            Matcher matcher = compile.matcher(str);
            while (matcher.find())
                System.out.println(matcher.group());
        }

        //4 заданние
        {
            String str = "One two three раз два три one1 two2 123 ";
            System.out.println(str.split("[ А-Яа-я0-9]+|([A-Za-z]*[0-9]+)").length);//

        }
        System.out.println("Task 5");
        System.out.println(validate("o1ne two three")); // добавил еще пробел, для наглядности

    }

    public static boolean validate(String str) {

        if (str.length() > 3 && str.length() < 21 &&str.equals(str.replaceAll("[^a-z15 ]", ""))) {
            return true;
        } else {
            return false;
        }

    }
}
