package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.intface.Input;
import ru.job4j.tracker.intface.Output;
import ru.job4j.tracker.intface.UserAction;

public class CreateAction implements UserAction {
    private final Output out;

    public CreateAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Add new Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        out.println("Добавленная заявка: " + item);
        return true;
    }
}