package org.softwaretechnologies;

import org.softwaretechnologies.employee.*;

import java.time.LocalDate;
import java.time.YearMonth;

public class EmployeeFactory {

    public EmployeeFactory(String name, int baseSalary) {
    }

    /**
     * Сначала создайте классы, наследуемые от  {@link  org.softwaretechnologies.employee.Employee Employee} для каждого из значений в EmployeeType.
     * Функция должна создавать и возвращать Employee нужного типа. Тип зависит от значения параметра type.
     *  name имя сотрудника
     *  baseSalary базовая зарплата сотрудника
     *  type тип сотрудника
     * @return созданного сотрудника нужного типа. Тип зависит от параметра type.
     */



    public static Employee createEmployee(String name, int baseSalary, EmployeeType type) {
        // TODO: реализуйте вышеуказанную функцию
        switch (type) {
            case Manager:
                return new Manager(name, baseSalary) {

                };
            case Tester:
                return new Tester(name, baseSalary) {

                };
            case Programmer:
                return new Programmer(name, baseSalary) {

                };
            default:
                throw new IllegalStateException("Unexpected type: " + type);
        }

    }
}
