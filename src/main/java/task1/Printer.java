package task1;

interface Printer {

    void print(String string);

    default void println(String s) {
        print(s + "\n");
    }
}
