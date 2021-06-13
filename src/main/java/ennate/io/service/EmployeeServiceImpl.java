package ennate.io.service;

import ennate.io.entity.Employee;
import ennate.io.exception.EmployeeNotFoundException;
import ennate.io.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findOne(String id) {
        Employee employee =  employeeRepository.findOne(id);
        if (employee == null) {
            throw new EmployeeNotFoundException("Employee with id " + id + " not found!");
        } else {
            return employee;
        }
    }

    @Override
    public Employee createEmp(Employee employee) {
        return null;
    }

    @Override
    public Employee updateEmp(String id, Employee employee) {
        return null;
    }

    @Override
    public void deleteEmp(String id) {

    }
}
