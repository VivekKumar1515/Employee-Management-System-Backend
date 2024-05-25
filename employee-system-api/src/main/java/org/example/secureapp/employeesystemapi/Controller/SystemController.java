package org.example.secureapp.employeesystemapi.Controller;

import org.example.secureapp.employeesystemapi.Model.Employee;
import org.example.secureapp.employeesystemapi.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/v1/")
public class SystemController {
    @Autowired
    Service service;

    @PostMapping("employee")
    public void addEmployee(@RequestBody Employee employee) {
        service.postEmployee(employee);
    }
    @PostMapping("employees")
    public void addEmployee(@RequestBody List<Employee> employee) {
        service.postEmployee(employee);
    }

    @GetMapping("employee")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @DeleteMapping("employee/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
    }

    @PutMapping("employee/{id}")
    public void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        service.updateEmployee(id, employee);
    }


    @GetMapping("employee/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }
}
