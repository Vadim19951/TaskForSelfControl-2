package task6;
/*
6
Checked vs Unchecked

Напишите метод FileUtils.readText(Path p) — он бросает IOException (checked).
Вызовите его из main,
отловите и выведите сообщение.

- В задании требуется, чтобы метод бросал IOException, но в реализации исключение уже обрабатывается в самом методе
FIX - Результат чтения файла не используется
FIX - Путь к файлу указан относительно рабочей директории, что может вызвать проблемы

 */


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main6 {
    public static void main(String[] args) {

//
//        Scanner scanner = new Scanner(System.in);
//        try {
//
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            System.out.println(a/b);
//        }catch (InputMismatchException e){
//            System.out.println("Произошел некорректный ввод: "+ e.getMessage());
//        }catch (ArithmeticException e){
//            System.out.println("Ошибка вычисления: " + e.getMessage());
//        }catch (Exception e){
//            System.out.println("Непредвиденная ошибка: " + e.getMessage());
//        }


        Path path = Paths.get("src/main/java/task6/textEX.txt");
        try {
            FileUtils.readText(path);
        }catch (IOException e){
            System.err.println("Ошибка считывания файла " + e.getMessage());
            e.printStackTrace();

        }
    }
}
