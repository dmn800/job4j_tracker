package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.sort.ItemAscByName;
import ru.job4j.tracker.sort.ItemDescAscByName;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemTest {
    @Test
    public void whenSortByName() {
        List<Item> items = Arrays.asList(
                new Item("test2", 2),
                new Item("test1", 1),
                new Item("abc", 10),
                new Item("xyz", 0)
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("abc", 10),
                new Item("test1", 1),
                new Item("test2", 2),
                new Item("xyz", 0)
        );
        assertThat(items).hasSameElementsAs(expected);
    }

    @Test
    public void whenSortDescByName() {
        List<Item> items = Arrays.asList(
                new Item("test2", 2),
                new Item("test1", 1),
                new Item("abc", 10),
                new Item("xyz", 0)
        );
        Collections.sort(items, new ItemDescAscByName());
        List<Item> expected = Arrays.asList(
                new Item("xyz", 0),
                new Item("test2", 2),
                new Item("test1", 1),
                new Item("abc", 10)
                );
        assertThat(items).hasSameElementsAs(expected);
    }
}