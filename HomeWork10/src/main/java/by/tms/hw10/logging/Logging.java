package by.tms.hw10.logging;


public class Logging {

    public static void checkAuth(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (loginСheck(login) && passwordСheck(password, confirmPassword)) {
            System.out.println("Authorization completed successfully");
        }


    }


    private static Boolean loginСheck(String login) throws WrongLoginException {
        boolean result = false;


        if ((login.length() > 3) && login.matches("\\w+")) {   //"^[a-zA-Z0-9_]+$"
            System.out.println("Login entered correctly");
            result = true;
        } else {
            result = false;
            throw new WrongLoginException("Login entered incorrectly");
        }
        return result;
    }

    private static Boolean passwordСheck(String password, String confirmPassword) throws WrongPasswordException {
        boolean result = false;
        if ((password.length() > 3) && password.matches("\\w+")) {
            if (password.equals(confirmPassword)) {
                System.out.println("Password entered correctly");
                result = true;
            } else {
                result = false;
                throw new WrongPasswordException("Passwords do not match");
            }

        } else {
            result = false;
            throw new WrongPasswordException("Password entered incorrectly");
        }
        return result;
    }
}
