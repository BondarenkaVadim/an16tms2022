package by.tms.hw10.logging;

import by.tms.hw10.logging.Logging;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        checkAuthorization("Vadim1ф_", "1234a", "1234a");
    }

    private static void checkAuthorization(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        Logging log = new Logging();


        try {
            log.checkAuth(login, password, confirmPassword);

        } catch (WrongLoginException exception) {
            System.out.println(exception.getMessage());
        } catch (WrongPasswordException exception) {
            System.out.println(exception.getMessage());
        }


    }
}
