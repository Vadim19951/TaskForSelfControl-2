import org.junit.jupiter.api.Test;
import task5.*;
import task5.Task;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestTask5 {

    @Test
    void equals(){
        boolean exp = true;
        Task task1 = new Task(1, "a");
        Task task2 = new Task(1, "b");
        boolean result = task1.equals(task2);
        assertEquals(exp, result);
    }
}
