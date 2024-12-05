package org.softwaretechnologies;

import org.softwaretechnologies.employee.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private final String name;
    private final List<EmployeeFactory> employeeList;

    public Company(String name) {
        this.name = name;
        this.employeeList = new ArrayList<EmployeeFactory>();
    }

    /**
     * Создает и добавляет сотрудника в коллекцию employeeList.
     * @param name имя работника
     * @param baseSalary базовая зарплата сотрудника
     * @param type тип работника
     */
    public void addEmployee(String name, int baseSalary, EmployeeType type) {
        // TODO: реализуйте вышеуказанную функцию
        Employee newEmployee = new Employee(name, baseSalary) {
            @Override
            public int getMonthSalary(int month) {
                return 0;
            }
        };
        employeeList.add(newEmployee);


    }

    /**
     * Возвращает сумму зарплат всех сотрудников за указанный месяц
     * @param month номер месяца
     * @return сумма зарплат всех сотрудников за указанный месяц
     */
    public int getMonthSalary(int month) {
        // TODO: реализуйте вышеуказанную функцию
        month = LocalDate.now().getMonthValue();
        int sum = employeeList.stream().mapToInt(employeeList::getMonthSalary).sum();
    return sum;
    }


    public String getName() {
        return name;
    }
}
