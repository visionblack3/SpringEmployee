package com.Aravind.Repo;

import com.Aravind.Model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, Integer> {
    Employee findByEmpId(int empId);
    void deleteByEmpId(int empId);
}
