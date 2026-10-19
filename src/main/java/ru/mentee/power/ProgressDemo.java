
package ru.mentee.power;

public class ProgressDemo {
    public static void main(String[] args) {
        MenteeProgress имяСтудента = new MenteeProgress("Имя студента", 1, 6);
        var progress = имяСтудента;
        System.out.println(progress.summary());

        if (progress.readyForSprint()) {
            System.out.println("Status: sprint ready");
        } else {
            System.out.println("Status: backlog first");
        }
        System.out.println("Working on branch: feature/DVT-3");
    }
}
