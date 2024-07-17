package org.scoula.studentscore.domain;

public class StudentScores {
    private static StudentScores instance = new StudentScores();
    private int studentNum;
    private int[] scores;

    private StudentScores() {
    }

    public static StudentScores getInstance() {
        return instance;
    }

    public void initializeScores(int studentNum) {
        this.studentNum = studentNum;
        this.scores = new int[studentNum];
    }

    public int getStudentNum() {
        return studentNum;
    }

    public int[] getScores() {
        return scores;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }
}
