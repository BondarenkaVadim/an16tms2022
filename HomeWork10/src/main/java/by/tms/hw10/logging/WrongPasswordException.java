package by.tms.hw10.logging;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message) {
        super(message);
    }

}
