package com.github.dhirabayashi.myecho;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void noArgs() {
        assertEquals("", Main.join());
    }

    @Test
    void oneArgs() {
        assertEquals("aaa", Main.join("aaa"));
    }

    @Test
    void twoArgs() {
        assertEquals("aaa bbb", Main.join("aaa", "bbb"));
    }

    @Test
    void envVar() {
        var expected = System.getenv("PATH");
        assertEquals(expected, Main.join("$PATH"));
    }

    @Test
    void escapedDollar() {
        assertEquals("$PATH", Main.join("\\$PATH"));
    }
}