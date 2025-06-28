package task1;

public class ConsolePrinter implements Printer{

    @Override
    public void print(String string) {
        System.out.print(string);
    }
}
