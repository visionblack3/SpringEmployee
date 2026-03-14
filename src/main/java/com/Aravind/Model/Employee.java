package com.Aravind.Model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Id
    private int empId;
    private String empName;
    private String empEmailId;
    private String empLocation;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmailId='" + empEmailId + '\'' +
                ", empLocation='" + empLocation + '\'' +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmailId() {
        return empEmailId;
    }

    public void setEmpEmailId(String empEmailId) {
        this.empEmailId = empEmailId;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }
}
