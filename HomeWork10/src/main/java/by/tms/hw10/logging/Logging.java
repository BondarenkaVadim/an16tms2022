package by.tms.hw10.logging;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Logging {


    public static void loginСheck(String login) throws WrongLoginException {

        System.out.println(login);
        if ((login.length() > 3) && login.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongLoginException("Login entered correctly");
        } else {
            throw new WrongLoginException("Login entered incorrectly");
        }
    }

    public static void passwordСheck(String password, String confirmPassword) throws WrongPasswordException {


        if ((password.length() > 3) && password.matches("^[a-zA-Z0-9_]+$") && password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password entered correctly");
        } else {
            throw new WrongPasswordException("Password entered incorrectly");
        }


    }
}
