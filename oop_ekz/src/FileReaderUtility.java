import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderUtility {
    public static void readFile(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено");
        }
    }
}
