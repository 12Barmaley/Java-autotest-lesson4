package ru.gb.lesson.lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HwTest {

    @Test
    void triangleAreaTest1() {
        assertEquals(6, Hw.triangleArea(3, 4, 5));
    }

    @Test
    void triangleAreaTest2() {
        assertEquals(20.33316256758894, Hw.triangleArea(7, 6, 8));
    }
}