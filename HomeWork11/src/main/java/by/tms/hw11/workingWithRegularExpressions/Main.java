package by.tms.hw11.workingWithRegularExpressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //2 задание_____________________
        {
            String str = "cab, ccab, cccab";
            String regex = "[a-zA-Z]+";
            String[] arrayStr = str.split("[\\.\\,\\ ]");
            for (int i = 0; i < arrayStr.length; i++) {
                Pattern pattern = Pattern.compile(regex);
                Matcher m = pattern.matcher(arrayStr[i]);
                if (m.find()) {
                    System.out.println(arrayStr[i]);
                }
            }
        }
        //3 задание_______________________
        //* 3) Дана строка "Versions:Java1, Java  5, Java 6, Java   7, Java 8, Java 12."  Найти все подстроки "Java X", где X - число и распечатать их.
        {
            //Java (\d)
            String str = "Versions:Java1 Java  5, Java 6, Java   7, Java 8, Java 12.";
            Pattern compile = Pattern.compile("Java(\\ *\\d*)");
            Matcher matcher = compile.matcher(str);
            while (matcher.find())
                System.out.println(matcher.group());
        }

        //4 заданние
//        {
//            String str = "One two three раз два три one1 two2 123 One12One One";
//            System.out.println(str.split("\\s*([A-Za-z]+)\\s+|\\s+([A-Za-z]+)$").length);// почему считает не верное? выражение то вреде верное
//            System.out.println(Arrays.toString(str.split("\s* \\w+")));
//
//            //Pattern compile = Pattern.compile("[A-Za-z]*[A-Za-z]\\ |\s[A-Za-z]*[A-Za-z]$");
//            Pattern compile = Pattern.compile("\\s*([A-Za-z]+)\\s+|\\s+([A-Za-z]+)$");
//            // compile = Pattern.compile("\\s*([A-Za-z]+)\\s+");
//            Matcher matcher = compile.matcher(str);
//            while (matcher.find()) {
//                System.out.println(matcher.group());
//            }
//        }
    }
}
