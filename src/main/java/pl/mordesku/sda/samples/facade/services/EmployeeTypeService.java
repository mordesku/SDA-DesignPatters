package pl.mordesku.sda.samples.facade.services;

import pl.mordesku.sda.samples.facade.model.EmployeeType;

/**
 * Created by Mateusz Przybylski on 2017-09-19.
 */
public class EmployeeTypeService {
    public Integer findTypeByName(String name) {
        switch (name) {
            case EmployeeType.INTERNAL:
                return 31337;
            case EmployeeType.PUBLIC:
                return -100;
        }
        return 0;
    }
}
