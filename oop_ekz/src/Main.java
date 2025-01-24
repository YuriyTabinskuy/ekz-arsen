import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List; 

public class Main {
    public static void main(String[] args) {
        Path userFilePath = Path.of("user.txt");
        try {
            if (!Files.exists(userFilePath)) {
                Files.createFile(userFilePath);
                System.out.println("Файл створено: " + userFilePath.toAbsolutePath());
            }
            Files.write(userFilePath, List.of("Name: Vitalik, Age: 25", "Name: Oksana, Age: 33"));
        } catch (IOException e) {
            System.err.println("Помилка при створенні або записі у файл: " + e.getMessage());
        }

        FileReaderUtility.readFile(userFilePath.toString());
    }
}
