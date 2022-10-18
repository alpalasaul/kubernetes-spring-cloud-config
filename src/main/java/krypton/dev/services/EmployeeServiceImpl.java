package krypton.dev.services;

import krypton.dev.dto.Employee;
import krypton.dev.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String DoSomething() {
        return "Hi Stranger :)";
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
        LOGGER.info(":::::::: Empleado {} guardo con éxito", employee.getName());
        LOGGER.warn(":::::::: Enviando mensaje de alerta");
    }

    @Override
    public List<Employee> getAll() {
        LOGGER.error("xxxxxx Enviando mensaje de error");
        return employeeRepository.findAll();
    }
}
