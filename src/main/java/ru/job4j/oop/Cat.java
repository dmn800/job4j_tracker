package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat kitty = new Cat();
        kitty.eat("Котлета");
        kitty.giveNick("Маркиз");
        kitty.show();
    }

    public void show() {
        System.out.println(this.name + " " + this.food);
    }

}
