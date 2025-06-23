package task7;

/*
enum + switch

Расширьте enum TaskStatus значением BLOCKED.
Метод canStart(TaskStatus) возвращает true только для NEW.
Используйте switch.
 */

public class Main7 {
    public static void main(String[] args) {
        System.out.println(canStart(TaskStatus.NEW));
    }

    public static boolean canStart(TaskStatus taskStatus){
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
