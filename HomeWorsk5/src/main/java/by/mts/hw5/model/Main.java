package by.mts.hw5.model;

public class Main {
    public static void main(String[] args) {

        Computer comp = new Computer();
        comp.setCpu("Intel 1058");
        comp.setRam("8GB");
        comp.setCycleResource(10);
        comp.setSsd("1Tb");
        System.out.println(comp);
        comp.on();
        comp.info();
    }
}
