package com.SchoolManagement;

import com.sun.source.tree.Scope;

public class Teacher {
    private int teach_id;
    private String teach_name;
    private int salary;
    private int accountBalance;

    public Teacher(int teach_id, String teach_name, int salary) {
        this.teach_id = teach_id;
        this.teach_name = teach_name;
        this.salary = salary;
        accountBalance = 0;
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
    public void receiveSalary(int salary) {
        this.accountBalance += salary;
        School.updateExpense(salary);
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return teach_name + " has a balance of:" + accountBalance;
    }
}