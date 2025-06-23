package task8;

/*
JUnit 5 — параметризованный тест

Протестируйте canStart() из п.7
на всех значениях TaskStatus с @CsvSource.
 */


public class Main8 {
    public static void main(String[] args) {
        System.out.println(canStart1(TaskStatus1.NEW));
    }

    public static boolean canStart1(TaskStatus1 taskStatus){
        switch (taskStatus){
            case NEW -> {
                return true;
            }
            case IN_PROGRESS, DONE, BLOCKED ->{
                return false;
            }
        }
        return false;
    }
}
