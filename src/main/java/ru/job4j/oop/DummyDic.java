package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        eng = "Неизвестное слово. " + eng;
        return eng;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String eng = "Ghbdtn";
        System.out.println(word.engToRus(eng));
    }
}
