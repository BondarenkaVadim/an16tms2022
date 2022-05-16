import java.util.Random;
import java.util.Scanner;

public class HomeWorks4 {
    public static void main(String[] args) {
        operatorSwitch();
        cellDivision();
        namber();
        zodiacSign();

    }


    private static void operatorSwitch() {
        Random random = new Random();
        int dayOfTheWeek = random.nextInt(7) + 1;
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6, 7:
                System.out.println("Day off");
                break;
        }
    }

    private static void cellDivision() {
        for (int h = 3, i = 0; h <= 24; h += 3, i++) {
            System.out.println("Passed " + h + " hours " + 2 * Math.pow(2, i));
        }
    }

    private static void namber() {
        Scanner console = new Scanner(System.in);
        if (console.hasNextInt()) {
            int i = console.nextInt();
            int num = Math.abs(i);
            int num_ = (int) Math.log10(num) + 1; // это если логорифмический подход
            // так же можно со string
            //int length = String.valueOf(num).length();
            if (i > 0) {
                System.out.println("Positive number " + num_);
            } else {
                System.out.println("Negative namber " + num_);
            }
        } else {
            System.out.println("error");

        }
    }

    private static void zodiacSign() {
        Scanner console = new Scanner(System.in);
        int value_month = 0;
        int value_day = 0;

        System.out.println("Enter for day");
        value_day = getEnteredValueFromConsoleDay(console);
        System.out.println("Etnet for Month");
        value_month = getEnteredValueFromConsoleMonth(console);

        switch (value_month) {
            case 1:
                if (value_day <= 20) {
                    System.out.println("Kozerog");
                } else {
                    System.out.println("Vodolei");
                }
                break;
            case 2:
                if (value_day <= 19) {
                    System.out.println("Vodolei");
                } else {
                    System.out.println("Ribi");
                }
                break;
            case 3:
                if (value_day <= 20) {
                    System.out.println("Ribi");
                } else {
                    System.out.println("Oven");
                }
                break;
            case 4:
                if (value_day <= 20) {
                    System.out.println("Oven");
                } else {
                    System.out.println("Telec");
                }
                break;
            case 5:
                if (value_day <= 21) {
                    System.out.println("Telec");
                } else {
                    System.out.println("Bliznec");
                }
                break;
            case 6:
                if (value_day <= 21) {
                    System.out.println("Bliznec");
                } else {
                    System.out.println("Rak");
                }
                break;
            case 7:
                if (value_day <= 22) {
                    System.out.println("Rak");
                } else {
                    System.out.println("Leon");
                }
                break;
            case 8:
                if (value_day <= 21) {
                    System.out.println("Leon");
                } else {
                    System.out.println("Deva");
                }
                break;
            case 9:
                if (value_day <= 23) {
                    System.out.println("Deva");
                } else {
                    System.out.println("Vesi");
                }
                break;
            case 10:
                if (value_day <= 23) {
                    System.out.println("Vesi");
                } else {
                    System.out.println("Scorpion");
                }
                break;
            case 11:
                if (value_day <= 23) {
                    System.out.println("Scorpion");
                } else {
                    System.out.println("Strelec");
                }
                break;

            case 12:
                if (value_day <= 22) {
                    System.out.println("Strelec");
                } else {
                    System.out.println("Kozerog1");
                }
                break;
        }
    }

    private static int getEnteredValueFromConsoleDay(Scanner console) {
        int value = 0;
        do {

            if (console.hasNextInt()) {
                value = console.nextInt();
            } else {
                console.next();
            }
        } while (value < 1 || value > 31);
        return value;
    }

    private static int getEnteredValueFromConsoleMonth(Scanner console) {
        int value = 0;

        do {
            if (console.hasNextInt()) {
                value = console.nextInt();
            } else {
                System.out.println("Error");
                console.next();
            }
        } while (value < 1 || value > 13);

        return value;
    }

}
