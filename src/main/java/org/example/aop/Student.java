package org.example.aop;

public class Student {
    private String fullName;
    private int course;
    private double avgScore;

    public Student(String fullName, int course, double avgScore) {
        this.fullName = fullName;
        this.course = course;
        this.avgScore = avgScore;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", course=" + course +
                ", avgScore=" + avgScore +
                '}';
    }
}