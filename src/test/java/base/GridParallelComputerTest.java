package base;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class GridParallelComputerTest {

    @Test
    public void runAllTests() {
        Class<?>[] classes = {RecordedTest.class, RecordedTest2.class};
        JUnitCore.runClasses(new ParallelComputer(true, true), classes);
    }
}
