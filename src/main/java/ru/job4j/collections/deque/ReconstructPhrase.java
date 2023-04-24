package ru.job4j.collections.deque;
import java.util.Deque;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;
    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
        }

    private String getEvenElements() {
        StringBuilder str = new StringBuilder();
        int n = evenElements.size();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                str.append(evenElements.poll());
            } else {
                evenElements.pop();
            }
        }
        return str.toString();
    }

    private String getDescendingElements() {
        StringBuilder str = new StringBuilder();
        int n = descendingElements.size();
        for (int i = 0; i < n; i++) {
            str.append(descendingElements.pollLast());
        }
        return str.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}