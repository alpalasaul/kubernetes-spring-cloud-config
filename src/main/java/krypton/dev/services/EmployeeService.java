package krypton.dev.services;

import krypton.dev.dto.Employee;

import java.util.List;

public interface EmployeeService {

    String DoSomething();

    void save(Employee employee);

    List<Employee> getAll();

}
