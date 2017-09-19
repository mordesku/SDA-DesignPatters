package pl.mordesku.sda.samples.facade.model;

/**
 * Created by Mateusz Przybylski on 2017-09-19.
 */
public class Employee {
    private String name;
    private String phoneNumber;
    private Integer type;

    public Employee(String name, String phoneNumber, Integer type) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", type=" + type + '}';
    }
}
