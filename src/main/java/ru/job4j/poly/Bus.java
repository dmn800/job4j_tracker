package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    @Override
    public void drive() {
        System.out.println("Водитель начал движение");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров " + count);
    }

    @Override
    public double priceOil(int volume) {
        double price = 50;
        return price * volume;
    }

    @Override
    public void move() {
        System.out.println("Автобус двигатеся по скоростным трассам.");
    }
}
