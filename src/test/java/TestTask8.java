import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import task8.Main8;
import task8.TaskStatus1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask8 {


    @ParameterizedTest
    @CsvSource (
        {
            "NEW, true",
            "IN_PROGRESS, false",
            "DONE, false",
            "BLOCKED, false"
        }
    )
    void canStart1Test(TaskStatus1 taskStatus, boolean exp){
        assertEquals(exp, Main8.canStart1(taskStatus));
    }



//    @Test
//    void canStart1() {
//        boolean expected = true;
//        boolean result = Main8.canStart1(TaskStatus1.NEW);
//        assertEquals(expected, result);
//        boolean expected1 = false;
//        boolean result1 = Main8.canStart1(TaskStatus1.IN_PROGRESS);
//        assertEquals(expected1, result1);
//        boolean expected2 = false;
//        boolean result2 = Main8.canStart1(TaskStatus1.DONE);
//        assertEquals(expected2, result2);
//        boolean expected3 = false;
//        boolean result3 = Main8.canStart1(TaskStatus1.BLOCKED);
//        assertEquals(expected3, result3);
//    }

}
