package task9;

/*
9
Interface Segregation

Интерфейс SmartPrinter разделите на =
Printable (только print) и Scannable (scan).
Класс SimplePrinter реализует только Printable.

 */

public class Main9 {
    public static void main(String[] args) {
        String txt = "HI";
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print(txt);
    }
}
