package com.team.greeting;

import org.junit.Test;
import static org.junit.Assert.*;
public class AppTest {
    @Test
    public void testGreeting() {
        assertEquals("¡Hello, DevOps!", App.greeting("DevOps"));
    }
}
