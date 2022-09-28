package ru.job4j.pojo;
import java.util.Calendar;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иванов Иван Иванович");
        student.setGroup("ММ-06");
        student.setStarted(new Date(2006, Calendar.SEPTEMBER, 1));

        System.out.println("Студент " +  student.getFullName() + " зачислен в группу " + student.getGroup() + ". Дата зачисления: " + student.getStarted());

    }
}
