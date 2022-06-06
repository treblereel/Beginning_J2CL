package org.treblereel.j2cl.helloworld;

import com.google.j2cl.junit.apt.J2clTestInput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@J2clTestInput(AppTest.class)
public class AppTest {

    @Test
    public void someSimpleTest() {
        assertEquals(App.HELLO_WORLD, new App().helloWorldString());
    }
}
