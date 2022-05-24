package by.mts.hw5.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private String ram;
    private String ssd;
    private int cycleResource;
    private Scanner console = new Scanner(System.in);
    private Random random = new Random();

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", cycleResource=" + cycleResource +
                '}';
    }

    public void on() {
//разбить на мелкие методы, 1 метод одно действие
        int i = 0;
        System.out.println("Warrning!!! Please enter 0 or 1");
     //   Scanner console = new Scanner(System.in); //вынести в глобальные переменные
        int enterNamber = console.nextInt();
       // Random random = new Random(); //вынести в глобальные переменные
        if (enterNamber == random.nextInt(2)) {
            System.out.println("Computer off");
        } else {
            System.out.println("Computer destroyed");

        }
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public int getCycleResource() {
        return cycleResource;
    }

    public void setCycleResource(int cycleResource) {
        this.cycleResource = cycleResource;
    }
    public void info(){
        System.out.println("процессор" + cpu + " оперативка " + ram);
    }
}
