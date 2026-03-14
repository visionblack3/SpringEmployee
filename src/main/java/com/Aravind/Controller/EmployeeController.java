package com.Aravind.Controller;

import com.Aravind.Model.Employee;
import com.Aravind.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee add(@RequestBody Employee emp) {
        return service.saveEmployee(emp);
    }

    @GetMapping("/displayAll")
    public List<Employee> viewAll() {
        return service.getAll();
    }

    @GetMapping("/display/{id}")
    public Employee findOne(@PathVariable int id) {
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable int id) {
        return service.deleteEmployee(id);
    }
    @GetMapping("/updateName/{id}/{name}")
    public String upName(@PathVariable int id, @PathVariable String name) {
        return service.updateName(id, name);
    }

    @GetMapping("/updateEmail/{id}/{email}")
    public String upEmail(@PathVariable int id, @PathVariable String email) {
        return service.updateEmail(id, email);
    }

    @GetMapping("/updateLoc/{id}/{loc}")
    public String upLoc(@PathVariable int id, @PathVariable String loc) {
        return service.updateLoc(id, loc);
    }

    @GetMapping("/update/{id}/{name}/{email}/{loc}")
    public String upAll(@PathVariable int id, @PathVariable String name,
                        @PathVariable String email, @PathVariable String loc) {
        return service.updateAll(id, name, email, loc);
    }
}
