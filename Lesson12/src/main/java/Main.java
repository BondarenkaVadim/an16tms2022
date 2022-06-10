import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {


    public static final String OUTPUT_FILE = "C:/works/TeachMeSkills/an16tms2022/Lesson12/input.txt";  //путь к файлу

    public static void main(String[] args) {
        TextAware testAware = new TextAware() {
            @Override
            public void test() {
                System.out.println("test");  //анонимный класс
            }
        };
        testAware.test();

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(OUTPUT_FILE);
            int value;
            while ((value = fileInputStream.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        try(FileInputStream fileInputStream1 = new FileInputStream(OUTPUT_FILE)) {
            int value;
            while ((value = fileInputStream.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
