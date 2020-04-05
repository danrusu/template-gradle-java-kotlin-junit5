package ro.qatools.demo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import ro.qatools.base.Main
import ro.qatools.base.demo

class DemoTest {
    @Test
    fun test3() {
        println("DemoTest.kt test3")
        Assertions.assertEquals("demo", demo());
    }

    @Tag("slow")
    @Test
    fun test4() {
        println("DemoTest.kt tripleTest4 slow")
        Assertions.assertEquals(150, Main.triple(50));
        Thread.sleep(3000);
    }
}