package pl.mordesku.sda.samples.facade;

import pl.mordesku.sda.samples.facade.model.Employee;

import java.util.List;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 18:00
 */
public class FacadeExample {
    public static void main(String[] args) {
        List<Employee> publicEmployess = new EmployeeFacade().getPublicEmployess();
        for (Employee employee : publicEmployess) {
            System.out.println(employee);
        }
    }
}
