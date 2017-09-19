package pl.mordesku.sda.samples.facade;

import pl.mordesku.sda.samples.facade.model.Employee;
import pl.mordesku.sda.samples.facade.model.EmployeeType;
import pl.mordesku.sda.samples.facade.services.EmployeeService;
import pl.mordesku.sda.samples.facade.services.EmployeeTypeService;

import java.util.List;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 17:58
 */
public class EmployeeFacade {
    private EmployeeTypeService employeeTypeService = new EmployeeTypeService();
    private EmployeeService employeeService = new EmployeeService();

    public List<Employee> getPublicEmployess() {
        Integer typeByName = employeeTypeService.findTypeByName(EmployeeType.PUBLIC);
        return employeeService.findByType(typeByName);
    }
}
