package com.shashi.controller;


import com.shashi.model.Employee;
import com.shashi.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class EmpolyeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/savedata")
    public ResponseEntity<Employee> savaData(@RequestBody Employee employee){
        log.info("************* Trying to save data for employee: "+employee.getEmpFirstName());
        return ResponseEntity.ok(employeeServiceImpl.saveData(employee));
    }

    @GetMapping("/getalldata")
    public ResponseEntity<List> getAllData(){
        return ResponseEntity.ok(employeeServiceImpl.getAllData());
    }

    @PutMapping("/updatedata/{empId}")
    public ResponseEntity<Employee> updateData(@PathVariable int empId, @RequestBody Employee employee){
        return ResponseEntity.ok(employeeServiceImpl.updateData(employee));
    }

    @DeleteMapping("deleteadata/{empId}")
    public ResponseEntity<String> dalateData(@PathVariable int empId){
        employeeServiceImpl.deleteData(empId);
        return ResponseEntity.ok("Deleted Data Successfully");
    }

    @GetMapping("getdatabyname/{empFirstName}")
    public ResponseEntity<List> getDataByName(@PathVariable String empFirstName){
        return ResponseEntity.ok(employeeServiceImpl.getDataByName(empFirstName));
    }
}
