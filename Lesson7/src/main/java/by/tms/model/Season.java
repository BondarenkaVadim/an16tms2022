package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


public enum Season {
    WINTER(1,"холод"), SUMMER(2, "ff"), AUTUMN(3, "ff"), SPRING(4, "ff");
    private final int id;
    private final String info;


    Season(int id, String info) {
        this.id = id;
        this.info = info;
    }
}
