package ru.mirea.pr6;


public class SortingStudentsByGPA extends student implements Comparable<student> {

    public SortingStudentsByGPA(String name, int iD, int points) {
        super(name, iD, points);
    }

    @Override
    public int compareTo(student o) {
        return this.points.compareTo(o.points);
    }
}