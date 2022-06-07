package by.tms.hw10.logging;

import by.tms.hw10.logging.Logging;

public class Main {
    public static void main(String[] args) throws WrongLoginException {

        checkAuthorization("Vadim1_", "1234a", "1234a");
    }

    private static void checkAuthorization(String login, String password, String confirmPassword) throws WrongLoginException {
        Logging log = new Logging();

        try {
            log.loginСheck(login);
        } catch (WrongLoginException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            log.passwordСheck(password, confirmPassword);
        } catch (WrongLoginException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
