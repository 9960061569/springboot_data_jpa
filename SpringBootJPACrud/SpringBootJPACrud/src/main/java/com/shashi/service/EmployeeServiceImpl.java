package com.shashi.service;

import com.shashi.dao.EmployeeDaoImpl;
import com.shashi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    public Employee saveData(Employee employee){
        return employeeDaoImpl.saveData(employee);
    }

    public List<Employee> getAllData(){
        return  employeeDaoImpl.getAllData();
    }

    public Employee updateData(Employee employee ){
        return employeeDaoImpl.upadateData(employee);
    }

    public  void deleteData(int empId){
        employeeDaoImpl.deleteData(empId);
    }

    public List<Employee> getDataByName(String empFirstName){
        return employeeDaoImpl.getDataByName(empFirstName);
    }
}
