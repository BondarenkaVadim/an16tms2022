package by.tms.hw10.logging;

import by.tms.hw10.logging.Logging;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        checkAuthorization("Vadim_1", "1234a", "1234a");
    }

    private static void checkAuthorization(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        Logging log = new Logging();

        try {
            log.loginСheck(login);
        } catch (WrongLoginException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            log.passwordСheck(password, confirmPassword);
        } catch (WrongPasswordException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
