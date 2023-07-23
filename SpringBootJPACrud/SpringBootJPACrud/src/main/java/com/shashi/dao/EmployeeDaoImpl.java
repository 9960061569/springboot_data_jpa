package com.shashi.dao;

import com.shashi.model.Employee;
import com.shashi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepository employeeRepositoryImpl;

    public Employee saveData(Employee employee){
        return employeeRepositoryImpl.save(employee);
    }

    public List<Employee> getAllData(){
        return  employeeRepositoryImpl.findAll();
    }

    public Employee upadateData(Employee employee){
        return employeeRepositoryImpl.save(employee);
    }

    public void deleteData(int empId){
        employeeRepositoryImpl.deleteById(empId);
    }

    public List<Employee> getDataByName(String empFirstName){
        return employeeRepositoryImpl.findByEmpFirstName(empFirstName);
    }
}
