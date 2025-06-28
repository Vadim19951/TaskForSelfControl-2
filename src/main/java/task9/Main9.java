package task9;

/*
9
Interface Segregation

Интерфейс SmartPrinter разделите на =
Printable (только print) и Scannable (scan).
Класс SimplePrinter реализует только Printable.

- Printable и Scannable наследуются от SmartPrinter, что противоречит идее разделения интерфейса
- SmartPrinter пуст, что делает наследование от него излишним

Привет, насколько помню, ты его не разделил, а просто отнаследовался

 */

public class Main9 {
    public static void main(String[] args) {
        String txt = "HI";
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print(txt);
    }
}

