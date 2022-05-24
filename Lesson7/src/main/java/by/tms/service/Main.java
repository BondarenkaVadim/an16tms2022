package by.tms.service;

import by.tms.model.Season;

public class Main {
    public static void main(String[] args) {

        System.out.println(Season.AUTUMN.name());
        Season[] values = Season.values();
        for (Season value: values){
            System.out.println(value);
        }
        Season autum = Season.valueOf("AUTTUM");
        System.out.println(Season.AUTUMN.toString());



    }
}
