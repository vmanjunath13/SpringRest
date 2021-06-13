package ennate.io.service;

import ennate.io.entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Vaishnavi", "vm@gmail.com", 80000));
        employees.add(new Employee("Ajith", "aj@gmail.com", 90000));
        employees.add(new Employee("Vaish", "vm1@gmail.com", 50000));
        return employees;
    }

    @Override
    public Employee findOne(String id) {
        Employee employee = new Employee("Vaish", "vm1@gmail.com", 50000);
        return employee;
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
