package ru.mentee.power;

public class ProgressDemo {
    public static void main(String[] args) {
        MenteeProgress progress = new MenteeProgress("Имя студента", 1, 6);
        System.out.println(progress.summary());
    }
}
