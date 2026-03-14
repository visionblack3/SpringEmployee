package com.Aravind.Service;

import com.Aravind.Model.Employee;
import com.Aravind.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public Employee saveEmployee(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee getById(int id) {
        return repo.findByEmpId(id); 
    }

    public String deleteEmployee(int id) {
        if (repo.findByEmpId(id) != null) {
            repo.deleteByEmpId(id);
            return "Employee " + id + " deleted successfully!";
        } else {
            return "Error: Employee " + id + " not found in database.";
        }
    }

    public String updateName(int id, String name) {
        Employee emp = repo.findByEmpId(id);
        if (emp != null) { emp.setEmpName(name); repo.save(emp); return "Name updated!"; }
        return "Not found";
    }

    public String updateEmail(int id, String email) {
        Employee emp = repo.findByEmpId(id);
        if (emp != null) { emp.setEmpEmailId(email); repo.save(emp); return "Email updated!"; }
        return "Not found";
    }

    public String updateLoc(int id, String loc) {
        Employee emp = repo.findByEmpId(id);
        if (emp != null) { emp.setEmpLocation(loc); repo.save(emp); return "Location updated!"; }
        return "Not found";
    }

    public String updateAll(int id, String name, String email, String loc) {
        Employee emp = repo.findByEmpId(id);
        if (emp != null) {
            emp.setEmpName(name);
            emp.setEmpEmailId(email);
            emp.setEmpLocation(loc);
            repo.save(emp);
            return "All fields updated for ID: " + id;
        }
        return "Not found";
    }
}
