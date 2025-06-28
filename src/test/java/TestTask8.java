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


}
