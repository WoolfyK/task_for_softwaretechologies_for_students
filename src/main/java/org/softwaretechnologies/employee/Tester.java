package org.softwaretechnologies.employee;
import java.time.LocalDate;
import java.time.YearMonth;

public abstract class Tester extends Employee {


    protected Tester(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public int getMonthSalary(int month) {
        return baseSalary * YearMonth.of(LocalDate.now().getYear(), month).lengthOfMonth();
    }
}
