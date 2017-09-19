package pl.mordesku.sda.samples.facade;

import java.util.List;

import pl.mordesku.sda.samples.facade.model.Employee;
import pl.mordesku.sda.samples.facade.model.EmployeeType;
import pl.mordesku.sda.samples.facade.services.EmployeeService;
import pl.mordesku.sda.samples.facade.services.EmployeeTypeService;

/**
 * Created by Mateusz Przybylski on 2017-09-19.
 */
public class NoFacadeExample {
    private static EmployeeTypeService employeeTypeService = new EmployeeTypeService();
    private static EmployeeService employeeService = new EmployeeService();

    public static void main(String[] args) {
        Integer typeByName = employeeTypeService.findTypeByName(EmployeeType.PUBLIC);
        List<Employee> byType = employeeService.findByType(typeByName);
        for (Employee employee : byType) {
            System.out.println(employee);
        }
    }
}
