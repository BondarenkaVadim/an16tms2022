package by.tms.hw10.logging;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WrongLoginException extends Exception {


    public WrongLoginException(String message) {
        super(message);
    }
}
