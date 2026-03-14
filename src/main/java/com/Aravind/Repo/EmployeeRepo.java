package com.Aravind.Repo;

import com.Aravind.Model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, Integer> {
    // Spring generates the logic to search the 'empId' field specifically
    Employee findByEmpId(int empId);
    // Custom delete logic for your field
    void deleteByEmpId(int empId);
}