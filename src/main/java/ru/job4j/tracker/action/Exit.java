package ru.job4j.tracker.action;

import ru.job4j.tracker.intface.Input;
import ru.job4j.tracker.intface.Output;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.intface.UserAction;

public class Exit implements UserAction {
    private final Output out;

    public Exit(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit Program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Exit Program ===");
        return false;
    }
}
