public class TextFormatter {

    public static int countString(String str) {
        return str.split(" ").length;
    }

    public static boolean checkPalindrome(String str) {

        boolean resulst = false;
        String[] search = str.split(" ");
        for (int i = 0; i < search.length; i++) {
            search[i] = search[i].toLowerCase();
            StringBuilder sBarr = new StringBuilder(search[i]);

            if (search[i].equals(sBarr.reverse().toString())) {
                resulst = true;
            }
        }
        return resulst;
    }
}
