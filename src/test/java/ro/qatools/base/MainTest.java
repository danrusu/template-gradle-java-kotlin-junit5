package ro.qatools.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Tag("slow")
    @Test
    public void test1() throws InterruptedException {
        System.out.println("MainTest1 test1");
        Assertions.assertEquals(150, Main.triple(50));
        Thread.sleep(3000);
    }

    @Test
    public void test2() throws InterruptedException {
        System.out.println("MainTest1 test2");
    }
}
