package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class  MaxTest {
    @Test
    public void whenMax1To2To3Then3() {
        Max max = new Max();
        int expected = 3;
        assertThat(max.max(1, 2, 3)).isEqualTo(expected);
    }

    @Test
    public void whenMax4To2To3Then4() {
        Max max = new Max();
        int expected = 4;
        assertThat(max.max(4, 2, 3)).isEqualTo(expected);
    }

    @Test
    public void whenMax1To4To3Then4() {
        Max max = new Max();
        int expected = 4;
        assertThat(max.max(1, 4, 3)).isEqualTo(expected);
    }

    @Test
    public void whenMax3To3To3Then3() {
        Max max = new Max();
        int expected = 3;
        assertThat(max.max(3, 3, 3)).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        Max max = new Max();
        int expected = 4;
        assertThat(max.max(1, 2, 3, 4)).isEqualTo(expected);
    }

    @Test
    public void whenMax6To4To2To1Then6() {
        Max max = new Max();
        int expected = 6;
        assertThat(max.max(6, 4, 2, 1)).isEqualTo(expected);
    }

}