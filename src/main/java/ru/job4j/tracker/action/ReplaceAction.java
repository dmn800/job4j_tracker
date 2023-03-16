package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.intface.Input;
import ru.job4j.tracker.intface.Output;
import ru.job4j.tracker.intface.UserAction;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ===");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Replace successfully.");
        } else {
            out.println("Ошибка замены заявки.");
        }
        return true;
    }
}