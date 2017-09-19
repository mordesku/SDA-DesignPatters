package pl.mordesku.sda.samples.facade.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pl.mordesku.sda.samples.facade.model.Employee;

/**
 * Created by Mateusz Przybylski on 2017-09-19.
 */
public class EmployeeService {
    public List<Employee> findByType(Integer type) {
        if (type.equals(-100)) {
            return Arrays.asList(
                    new Employee("Henio Konwea", "74737372373", -100),
                    new Employee("Zdzichu Sprzęgło", "345345546", -100),
                    new Employee("Kazio Wichura", "67u9789789", -100),
                    new Employee("Zenobiusz Jajo", "09399393", -100),
                    new Employee("Andrzej Huragan", "000000000", -100)
            );
        }
        return new ArrayList<>();
    }
}
