package ennate.io.repository;

import ennate.io.entity.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAll();
    Employee findOne(String id);
    Employee createEmp(Employee employee);
    Employee updateEmp(String id, Employee employee);
    void deleteEmp(String id);
}
