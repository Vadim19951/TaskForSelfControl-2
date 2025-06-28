package task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {

    public static void readText(Path p) throws IOException {
        String content = Files.readString(p);
        System.out.println(content);
    }
}
