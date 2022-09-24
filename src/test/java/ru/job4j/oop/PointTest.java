package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        int expected = 2;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when00to11then1dot41() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        double expected = 1.41;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when00to34then5() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        int expected = 5;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when57to21then6dot71() {
        Point a = new Point(5, 7);
        Point b = new Point(2, 1);
        double expected = 6.71;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }
}