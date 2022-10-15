package ru.job4j.poly;

public class Bus implements Transport {
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
}
