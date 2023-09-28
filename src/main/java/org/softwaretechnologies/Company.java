package org.softwaretechnologies;

import org.softwaretechnologies.employee.*;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private final String name;
    private final List<Employee> employeeList;

    public Company(String name) {
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    /**
     * Создает и добавляет сотрудника в коллекцию employeeList.
     * @param name имя работника
     * @param baseSalary базовая зарплата сотрудника
     * @param type тип работника
     */
    public void addEmployee(String name, int baseSalary, EmployeeType type) {
        // TODO: реализуйте вышеуказанную функцию
        EmployeeFactory newEmployee = new EmployeeFactory(name, baseSalary);
        employeeList.add(newEmployee);


    };

    /**
     * Возвращает сумму зарплат всех сотрудников за указанный месяц
     * @param month номер месяца
     * @return сумма зарплат всех сотрудников за указанный месяц
     */
    public int getTotalSalary(int month) {
        // TODO: реализуйте вышеуказанную функцию
        int total = 0;
        for (Employee employee : employeeList) {
            total += employee.getMonthSalary();
        }
        return total;
        return 0;
    }

    public String getName() {
        return name;
    }
}
