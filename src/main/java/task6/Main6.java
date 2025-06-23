package task6;

/*
6
Checked vs Unchecked

Напишите метод FileUtils.readText(Path p) — он бросает IOException (checked).
Вызовите его из main,
отловите и выведите сообщение.
 */

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main6 {
    public static void main(String[] args) {

        Path path = Paths.get("textEX.txt");
        FileUtils.readText(path);
    }
}
