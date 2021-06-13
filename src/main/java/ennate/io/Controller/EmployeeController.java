package ennate.io.Controller;

import ennate.io.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "employees")
public class EmployeeController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Vaishnavi", "vm@gmail.com", 80000));
        employees.add(new Employee("Ajith", "aj@gmail.com", 90000));
        employees.add(new Employee("Vaish", "vm1@gmail.com", 50000));
        return employees;
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Employee findOne(@PathVariable("id") String empId) {
        Employee employee = new Employee("Vaish", "vm1@gmail.com", 50000);
        return employee;
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
