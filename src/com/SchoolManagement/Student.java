package com.SchoolManagement;

public class Student {
    private int stu_id;
    private String stu_name;
    private String grade;
    private int feesPaid;
    private int totalFess;

    public Student(int stu_id, String stu_name, String grade) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.grade = grade;
        this.feesPaid = 0;
        this.totalFess = 30000;
    }

    // updating students grade
    public void updateGrade(String grade) {
        this.grade = grade;
    }

    public void updateFeesPaid(int fees) {
        this.feesPaid += fees;
    }
}
