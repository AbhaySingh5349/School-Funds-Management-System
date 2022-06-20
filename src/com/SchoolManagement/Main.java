package com.SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(1,"t1",100);
        Teacher t2 = new Teacher(2,"t2",200);
        Teacher t3 = new Teacher(3,"t3",100);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);

        Student s1 = new Student(1,"s1",8);
        Student s2 = new Student(2,"s2",9);
        Student s3 = new Student(3,"s3",8);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        School school = new School(teacherList,studentList);

        s1.payFees(5000);
        s2.payFees(4000);
        s3.payFees(8000);

        System.out.println(school.getEarnings());

        System.out.println("----School Paying Salaries----");

        t1.receiveSalary(t1.getSalary());
        System.out.println("Balance of t1:" + t1.getAccountBalance());

        t2.receiveSalary(t2.getSalary());
        System.out.println("Balance of t2:" + t2.getAccountBalance());

        t3.receiveSalary(t3.getSalary());
        System.out.println("Balance of t3:" + t3.getAccountBalance());

        // invoking toString() method
        System.out.println(s1);
        System.out.println(t1);
    }
}