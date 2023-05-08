package ru.job4j.collections.queue;

public record Task(Position position,
                   String description,
                   int urgency) {
}
