package com.github.dhirabayashi.myecho;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void noArgs() {
        assertEquals("\n", Main.join());
    }

    @Test
    void oneArgs() {
        assertEquals("aaa\n", Main.join("aaa"));
    }

    @Test
    void twoArgs() {
        assertEquals("aaa bbb\n", Main.join("aaa", "bbb"));
    }

    @Test
    void noNewLine() {
        assertEquals("aaa", Main.join("-n", "aaa"));
    }
}