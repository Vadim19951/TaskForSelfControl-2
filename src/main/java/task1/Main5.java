package task1;


/*
🔷 Задание:
Интерфейсы 2.0	Сделайте интерфейс Printer с print(String).
Добавьте default void println(String s) { print(s + "\n"); }.
Реализуйте в классе ConsolePrinter.

 */



public class Main5 {
    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        consolePrinter.println("Helo!");
        consolePrinter.print("Hi");
    }
}




