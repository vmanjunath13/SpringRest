package ennate.io.controller;

import ennate.io.entity.Employee;
import ennate.io.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> findAll() {
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Employee findOne(@PathVariable("id") String empId) {
        return service.findOne(empId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Employee createEmp(@RequestBody Employee employee) {
        return employee;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public Employee updateEmp(@PathVariable("id") String empId, @RequestBody Employee employee) {
        return employee;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void deleteEmp(@PathVariable("id") String empId) {
        System.out.println("Employee deleted");
    }
}
