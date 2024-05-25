package org.example.secureapp.employeesystemapi.Service;

import org.example.secureapp.employeesystemapi.Model.Employee;
import org.example.secureapp.employeesystemapi.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Employee employee;

    @Autowired
    EmployeeRepo repo;

    public void postEmployee(Employee employee) {
        repo.save(employee);
    }
    public void postEmployee(List<Employee> employee) {
        repo.saveAll(employee);
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = repo.findAll();
        return employees;
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }

    public void updateEmployee(Long id, Employee employee) {
        Employee employee1 = repo.findById(id).get();
        employee1.setEmployeeId(id);
        employee1.setEmployeeName(employee.getEmployeeName());
        employee1.setEmployeeSurname(employee.getEmployeeSurname());
        employee1.setEmployeeEmail(employee.getEmployeeEmail());
        employee1.setEmployeePhone(employee.getEmployeePhone());
        repo.save(employee1);
    }

    @Lazy
    public Employee getEmployeeById(Long id) {
        return repo.findById(id).get();
    }
}
