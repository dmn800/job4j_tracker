package ru.job4j.stream;

import java.util.stream.Stream;

class Cards {
    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values())
                        .map(value -> new Card(suit, value)))
                .forEach(System.out::println);
    }
}
