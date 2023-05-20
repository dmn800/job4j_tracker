package ru.job4j.collections.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int sum = 0, count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
        }
        return  (double) sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> label = new ArrayList<>();
        int sum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            label.add(new Label(pupil.name(), (double) sum / pupils.size()));
            sum = 0;
        }
        return label;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> label = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), (oldValue, newValue) -> oldValue + newValue);            }
        }
        for (String key : map.keySet()) {
            label.add(new Label(key, (double) map.get(key) / pupils.size()));
        }
        return label;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> label = new ArrayList<>();
        int sum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            label.add(new Label(pupil.name(), sum));
            sum = 0;
        }
        if (!label.isEmpty()) {
            label.sort(Comparator.naturalOrder());
        }
        return label.get(label.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> label = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), (oldValue, newValue) -> oldValue + newValue);            }
        }
        for (String key : map.keySet()) {
            label.add(new Label(key, map.get(key)));
        }
        if (!label.isEmpty()) {
            label.sort(Comparator.naturalOrder());
        }
        return label.get(label.size() - 1);
    }
}
