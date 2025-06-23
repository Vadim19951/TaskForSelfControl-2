package task5;

/*

equals / hashCode

Переопределите эти методы в Task(id, name),

чтобы new Task(1,"a").equals(new Task(1,"b")) было true.

Покройте тестом.
 */

public class Main1 {
    public static void main(String[] args) {
        Task task1 = new Task(1, "a");
        Task task2 = new Task(1, "b");
        System.out.println(task1.equals(task2));
    }
}
