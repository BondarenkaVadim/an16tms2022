package by.tms.hw11.workingWithStrings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Employee implements Report {
    private String fullname;
    private double salary;

    private String fio() {

        String[] search = fullname.split("[\\ ]");
        String name = "";
        for (int i = 1; i < search.length; i++) {
            name = name + search[i].charAt(0) + ".";
        }
        return name + " " + search[0];
    }

    @Override
    public void generateReport() {
        System.out.printf("| %-20s | %10.2f %n", fio(), salary);

    }
}

