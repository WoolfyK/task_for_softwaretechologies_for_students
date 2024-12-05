package org.softwaretechnologies.employee;

public abstract class Programmer extends Employee {
    public Programmer(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public int getMonthSalary(int month) {
        return baseSalary;
    }
}
