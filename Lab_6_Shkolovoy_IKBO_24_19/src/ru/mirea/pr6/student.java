package ru.mirea.pr6;

ppublic class student implements Comparable<student> {

    protected final String name;
    protected final Integer iD;
    protected final Integer points;

    public Student(String name, int iD, int points) {
        this.name = name;
        this.iD = iD;
        this.points = points;
    }

    @Override
    public int compareTo(student o) {
        return this.iD.compareTo(o.iD);
    }

    @Override
    public String toString() {
        return "Student: " + this.name + ". ID: " + this.iD + ". Points: " + this.points + ".";
    }
}