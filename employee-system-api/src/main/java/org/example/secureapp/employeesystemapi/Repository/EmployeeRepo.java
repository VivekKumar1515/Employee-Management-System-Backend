package org.example.secureapp.employeesystemapi.Repository;

import org.example.secureapp.employeesystemapi.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
