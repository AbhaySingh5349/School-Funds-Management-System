package com.SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teacherList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();

    private int earnings, expense;

    public School(List<Teacher> teacherList, List<Student> studentList) {
        this.teacherList = teacherList;
        this.studentList = studentList;
        earnings=0;
        expense=0;
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
        return earnings;
    }

    public void updateEarnings(int earnings) {
        this.earnings += earnings;
    }

    public int getExpense() {
        return expense;
    }

    public void updateExpense(int expense) {
        this.expense -= expense;
    }
}