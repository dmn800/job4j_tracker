package ru.job4j.tracker.output;

import ru.job4j.tracker.intface.Output;

public class ConsoleOutput implements Output {
    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}
