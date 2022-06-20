package com.SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teacherList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();

    public static int totalEarnings, totalExpense;

    public School(List<Teacher> teacherList, List<Student> studentList) {
        this.teacherList = teacherList;
        this.studentList = studentList;
        totalEarnings=0;
        totalExpense=0;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void addTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public int getEarnings() {
        return totalEarnings;
    }

    public static void updateEarnings(int earnings) {
        totalEarnings += earnings;
    }

    public int getExpense() {
        return totalExpense;
    }

    public static void updateExpense(int expense) {
        totalExpense -= expense;
    }
}