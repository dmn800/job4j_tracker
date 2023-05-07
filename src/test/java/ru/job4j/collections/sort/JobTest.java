package ru.job4j.collections.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class JobTest {
    @Test
    public void whenSortByName() {
        List<Job> jobs = Arrays.asList(
        new Job("Impl task", 2),
        new Job("Fix bugs", 4),
        new Job("X task", 0),
        new Job("Reboot server", 1)
        );
        Collections.sort(jobs, new JobByName());
        List<Job> expected = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1),
                new Job("X task", 0)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenSortDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Impl task", 2),
                new Job("Fix bugs", 4),
                new Job("X task", 0),
                new Job("Reboot server", 1)
        );
        Collections.sort(jobs, new JobDescByName());
        List<Job> expected = Arrays.asList(
                new Job("X task", 0),
                new Job("Reboot server", 1),
                new Job("Impl task", 2),
                new Job("Fix bugs", 4)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenSortByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Impl task", 2),
                new Job("Fix bugs", 4),
                new Job("X task", 0),
                new Job("Reboot server", 1)
        );
        Collections.sort(jobs, new JobByPriority());
        List<Job> expected = Arrays.asList(
                new Job("X task", 0),
                new Job("Reboot server", 1),
                new Job("Impl task", 2),
                new Job("Fix bugs", 4)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenSortDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Impl task", 2),
                new Job("Fix bugs", 4),
                new Job("X task", 0),
                new Job("Reboot server", 1)
        );
        Collections.sort(jobs, new JobDescByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1),
                new Job("X task", 0)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmp =
                new JobByName().thenComparing(
                        new JobByPriority()
                );
        List<Job> jobs = Arrays.asList(
                new Job("Impl task", 2),
                new Job("Fix bugs", 2),
                new Job("Fix bugs", 0),
                new Job("Fix bugs", 3),
                new Job("Fix bugs", 4),
                new Job("X task", 0),
                new Job("Reboot server", 1)
        );
        Collections.sort(jobs, cmp);
        List<Job> expected = Arrays.asList(
                new Job("Fix bugs", 0),
                new Job("Fix bugs", 2),
                new Job("Fix bugs", 3),
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1),
                new Job("X task", 0)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenComparatorByDescNameAndDescPriority() {
        Comparator<Job> cmp =
                new JobDescByName().thenComparing(
                        new JobDescByPriority()
                );
        List<Job> jobs = Arrays.asList(
                new Job("Impl task", 2),
                new Job("Fix bugs", 2),
                new Job("Fix bugs", 0),
                new Job("Fix bugs", 3),
                new Job("Fix bugs", 4),
                new Job("X task", 0),
                new Job("Reboot server", 1)
        );
        Collections.sort(jobs, cmp);
        List<Job> expected = Arrays.asList(
                new Job("X task", 0),
                new Job("Reboot server", 1),
                new Job("Impl task", 2),
                new Job("Fix bugs", 4),
                new Job("Fix bugs", 3),
                new Job("Fix bugs", 2),
                new Job("Fix bugs", 0)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenComparatorByPriorityAndName() {
        Comparator<Job> cmp =
                new JobByPriority().thenComparing(
                        new JobByName()
                );
        List<Job> jobs = Arrays.asList(
                new Job("Impl task", 2),
                new Job("Fix bugs", 2),
                new Job("Fix bugs", 0),
                new Job("Fix bugs", 3),
                new Job("Fix bugs", 4),
                new Job("X task", 0),
                new Job("Reboot server", 1)
        );
        Collections.sort(jobs, cmp);
        List<Job> expected = Arrays.asList(
                new Job("Fix bugs", 0),
                new Job("X task", 0),
                new Job("Reboot server", 1),
                new Job("Fix bugs", 2),
                new Job("Impl task", 2),
                new Job("Fix bugs", 3),
                new Job("Fix bugs", 4)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenComparatorByDescPriorityAndDescName() {
        Comparator<Job> cmp =
                new JobDescByPriority().thenComparing(
                        new JobDescByName()
                );
        List<Job> jobs = Arrays.asList(
                new Job("Impl task", 2),
                new Job("Fix bugs", 2),
                new Job("Fix bugs", 0),
                new Job("Fix bugs", 3),
                new Job("Fix bugs", 4),
                new Job("X task", 0),
                new Job("Reboot server", 1)
        );
        Collections.sort(jobs, cmp);
        List<Job> expected = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Fix bugs", 3),
                new Job("Impl task", 2),
                new Job("Fix bugs", 2),
                new Job("Reboot server", 1),
                new Job("X task", 0),
                new Job("Fix bugs", 0)
        );
        assertThat(jobs).isEqualTo(expected);
    }
}