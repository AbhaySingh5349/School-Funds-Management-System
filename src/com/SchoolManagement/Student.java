package com.SchoolManagement;

public class Student {
    private int stu_id;
    private String stu_name;
    private int grade;
    private int feesPaid;
    private int totalFess;

    public Student(int stu_id, String stu_name, int grade) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.grade = grade;
        this.feesPaid = 0;
        this.totalFess = 30000;
    }

    public int getStu_id() {
        return stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getTotalFess() {
        return totalFess;
    }

    // updating students grade
    public void updateGrade(int grade) {
        this.grade = grade;
    }
    public void payFees(int fees){
        if(this.totalFess >= this.feesPaid + fees){
            this.feesPaid += fees;
            School.updateEarnings(fees);
        }else{
            System.out.println("you are paying extra fees of:" + (this.feesPaid + fees - this.totalFess));
        }
    }

    public void getRemainingFees(){
        System.out.println(this.totalFess-this.feesPaid);
    }

    @Override
    public String toString() {
        return stu_name + " has paid fee of:" + feesPaid;
    }
}