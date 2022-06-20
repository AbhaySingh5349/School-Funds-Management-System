package com.SchoolManagement;

public class Teacher {
    private int teach_id;
    private String teach_name;
    private int salary;

    public Teacher(int teach_id, String teach_name, int salary) {
        this.teach_id = teach_id;
        this.teach_name = teach_name;
        this.salary = salary;
    }

    public int getTeach_id() {
        return teach_id;
    }

    public String getTeach_name() {
        return teach_name;
    }

    public int getSalary() {
        return salary;
    }

    // update salary
    public void updateSalary(int salary) {
        this.salary += salary;
    }
}