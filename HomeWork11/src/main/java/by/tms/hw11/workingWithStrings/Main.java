package by.tms.hw11.workingWithStrings;

import by.tms.hw11.workingWithStrings.Employee;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String str = "TesAt stBringB";
        String strResult1 = str.substring(str.indexOf('A'), str.lastIndexOf('B') + 1);
        String strResult2 = str.replace(str.charAt(0), str.charAt(3));

        String[] strArray = {"brat", "zakaz", "kazak", "ded", "minsk", "mama"};


        System.out.println(str);
        System.out.println(strResult1);
        System.out.println(strResult2);
        System.out.println("____________");
        // 3 задание
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = strArray[i].toLowerCase();
            StringBuilder sBarr = new StringBuilder(strArray[i]);
            if (strArray[i].equals(sBarr.reverse().toString())) {
                System.out.println(strArray[i]);
            }
        }
        // 5 задание, оно же и 7
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() % 2 == 0) {
                System.out.println(strArray[i].substring(strArray[i].length() / 2 - 1, strArray[i].length() / 2 + 1));

            }
        }

        //задание 4
        String text = "Priver. Eto testovii text. On sluzit tolko dly proverki togo cto poluchilos. I ne bolee togo kaktotak. Prosila Kazak";
        String[] sentences = text.split("[\\.\\!\\?]");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].trim();
            if (((countWord(sentences[i]) >= 3) && (countWord(sentences[i]) <= 5)) || searchPalindrome(sentences[i]))
                System.out.println(sentences[i]);
        }

        //6 задача__________________________
        {
            Employee person = new Employee("Bondarenko Vadim Aleksandrovich", 3060.40);
            person.generateReport();
        }
        {
            Employee person = new Employee("Kaniyshik Viktor Nikolaevich", 4685.738);
            person.generateReport();
        }
        {
            Employee person = new Employee("Cherniavski Aleksandr Mariamovich", 3500.948);
            person.generateReport();
        }

        {
            Employee person = new Employee("Korchemnii Artur Igorevich", 2505.9046);
            person.generateReport();
        }
        //8 задача ______________________----
        String text2 = "Методы доступа называют ещё аксессорами (от англ. access — доступ), или по отдельности — геттерами (англ. get — чтение) and сеттерами (англ. set — запись)";
        String regex = "[a-zA-Z]+";

        String[] arrayText2 = text2.split("[\\.\\!\\?\\ \\(\\)]");
        for (int i = 0; i < arrayText2.length; i++) {
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(arrayText2[i]);
            if (m.find()){
                System.out.println(arrayText2[i]);
            }
        }
    }

    private static boolean searchPalindrome(String sentences) {
        boolean resulst = false;
        String[] search = sentences.split("[\\ ]");
        for (int i = 0; i < search.length; i++) {

            search[i] = search[i].toLowerCase();
            StringBuilder sBarr = new StringBuilder(search[i]);

            if (search[i].equals(sBarr.reverse().toString())) {
                resulst = true;
            }
        }
        return resulst;
    }

    private static int countWord(String sentences) {
        int count = 0;
        count = sentences.split(" ").length;
        return count;
    }


}
