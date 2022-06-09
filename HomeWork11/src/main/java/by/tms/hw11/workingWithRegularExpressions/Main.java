package by.tms.hw11.workingWithRegularExpressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //1 задание_____________________
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
        //2 задание_______________________
        //* 3) Дана строка "Versions:Java1, Java  5, Java 6, Java   7, Java 8, Java 12."  Найти все подстроки "Java X", где X - число и распечатать их.
        {
            //Java (\d)
            String str = "Versions:Java1 Java  5, Java 6, Java   7, Java 8, Java 12.";
            Pattern compile = Pattern.compile("Java(\\ *\\d*)");
            Matcher matcher = compile.matcher(str);
            while (matcher.find())
            System.out.println(matcher.group());
        }
    }
}
