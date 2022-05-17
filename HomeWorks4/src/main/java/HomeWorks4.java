import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorks4 {
    public static void main(String[] args) {
        //operatorSwitch();
        //cellDivision();
        //namber();
        //zodiacSign();
        //dinamicArray();
        //consoleOperation();
        //printPrimeNumbers();
        countDevs();


    }

    public static void countDevs() {
        Scanner console = new Scanner(System.in);
        int namber = console.nextInt();
        int rez = namber % 10;
        if (rez == 0 || (rez >= 5 && rez <= 9)) {
            System.out.println(namber + " Programmistov");
        } else {
            if ((rez > 1) && (rez < 5)) {
                System.out.println(namber + " Programmista");
            } else {
                if (rez == 1)
                    System.out.println(namber + " Programmist");
            }
        }
    }

    public static void printPrimeNumbers() {
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = i;
        }
        for (int i = 0; i < 1000; i++) {
            for (int j = 2; j < 1000; j++) {

                if ((array[i] % j != 0) || array[i] == j) {
                    array[i] = array[i];
                } else {
                    array[i] = 0;
                }
            }
        }
        for (int i = 0; i < 1000; i++) {
            if ((array[i] != 0) && array[i] != 1)
                System.out.print(array[i] + " ");
        }
        // System.out.println(Arrays.toString(array));
    }

    private static void consoleOperation() {
        Scanner console = new Scanner(System.in);
        int namber = console.nextInt();
        System.out.println(operation(namber) + " " + namber);
    }

    public static int operation(int number) {
        int a = number;
        if (number > 0) {
            return number + 1;
        } else {
            return number - 2;
        }
        // тут пишем логику
    }

    private static void dinamicArray() {
        int valueNamber = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Etnet for namber");
        valueNamber = getEnteredValueFromConsoleNamber(console);
        int[] array = new int[valueNamber];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

    }

    private static int getEnteredValueFromConsoleNamber(Scanner console) {
        int value = 0;
        do {
            if (console.hasNextInt()) {
                value = console.nextInt();
            } else {
                System.out.println("Entered not a number");
                console.next();
            }
            if (value < 1) {
                System.out.println("Namber entered incorrectly");
            }
        } while (value < 1);

        return value;
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
            int numFinal = (int) Math.log10(num) + 1; // это если логорифмический подход
            // так же можно со string
            //int length = String.valueOf(num).length();
            if (i > 0) {
                System.out.println("Positive number " + numFinal);
            } else {
                System.out.println("Negative namber " + numFinal);
            }
        } else {
            System.out.println("error");

        }
    }

    private static void zodiacSign() {
        Scanner console = new Scanner(System.in);
        int valueMonth = 0;
        int valueDay = 0;
        //2 boolean MonthCheck = false;


        System.out.println("Etnet for Month");
        valueMonth = getEnteredValueFromConsoleMonth(console);
        System.out.println("Enter for day");
        valueDay = getEnteredValueFromConsoleDay(console);

        //  MonthCheck = getEnteredValueFromConsoleMonthCheck(valueDay, valueMonth);
        switch (valueMonth) {
            case 1:
                if (valueDay <= 20) {
                    System.out.println("Kozerog");
                } else {
                    System.out.println("Vodolei");
                }
                break;
            case 2:
                if (valueDay <= 19) {
                    System.out.println("Vodolei");
                } else {
                    System.out.println("Ribi");
                }
                break;
            case 3:
                if (valueDay <= 20) {
                    System.out.println("Ribi");
                } else {
                    System.out.println("Oven");
                }
                break;
            case 4:
                if (valueDay <= 20) {
                    System.out.println("Oven");
                } else {
                    System.out.println("Telec");
                }
                break;
            case 5:
                if (valueDay <= 21) {
                    System.out.println("Telec");
                } else {
                    System.out.println("Bliznec");
                }
                break;
            case 6:
                if (valueDay <= 21) {
                    System.out.println("Bliznec");
                } else {
                    System.out.println("Rak");
                }
                break;
            case 7:
                if (valueDay <= 22) {
                    System.out.println("Rak");
                } else {
                    System.out.println("Leon");
                }
                break;
            case 8:
                if (valueDay <= 21) {
                    System.out.println("Leon");
                } else {
                    System.out.println("Deva");
                }
                break;
            case 9:
                if (valueDay <= 23) {
                    System.out.println("Deva");
                } else {
                    System.out.println("Vesi");
                }
                break;
            case 10:
                if (valueDay <= 23) {
                    System.out.println("Vesi");
                } else {
                    System.out.println("Scorpion");
                }
                break;
            case 11:
                if (valueDay <= 23) {
                    System.out.println("Scorpion");
                } else {
                    System.out.println("Strelec");
                }
                break;

            case 12:
                if (valueDay <= 22) {
                    System.out.println("Strelec");
                } else {
                    System.out.println("Kozerog");
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
                System.out.println("Entered not a number");
                console.next();
            }
            if ((value < 1) || (value > 31)) {
                System.out.println("Day entered incorrectly");
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
                System.out.println("Entered not a number");
                console.next();
            }
            if ((value < 1) || (value > 12)) {
                System.out.println("Month entered incorrectly");
            }
        } while (value < 1 || value > 12);

        return value;
    }

}
