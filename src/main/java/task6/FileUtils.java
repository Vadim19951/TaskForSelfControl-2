package task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {

    public static void readText(Path p){
        try {
            String content = Files.readString(p);

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
