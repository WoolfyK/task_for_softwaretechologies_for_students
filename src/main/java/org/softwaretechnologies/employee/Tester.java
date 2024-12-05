package org.softwaretechnologies.employee;

import java.time.LocalDate;
import java.time.YearMonth;

public abstract class Tester extends Employee {
    public Tester(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public int getMonthSalary(int month) {
        int daysInMonth = YearMonth.of(LocalDate.now().getYear(), month).lengthOfMonth();

        return baseSalary * daysInMonth;
    }
}