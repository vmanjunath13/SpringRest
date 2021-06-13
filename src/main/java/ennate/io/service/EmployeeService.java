package ennate.io.service;

import ennate.io.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findOne(String id);
    Employee createEmp(Employee employee);
    Employee updateEmp(String id, Employee employee);
    void deleteEmp(String id);
}
