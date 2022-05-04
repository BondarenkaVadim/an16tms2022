import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int i=0;
        Scanner console = new Scanner(System.in);
        while(console.hasNextInt()) {
            int x = console.nextInt();
            if (x>0)
                i++;
        }
System.out.println(i);
    }
}
