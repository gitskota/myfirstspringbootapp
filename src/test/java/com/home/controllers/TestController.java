package com.home.controllers;


import com.home.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)

    public Employee firstPage(){

        Employee employee = new Employee();
        employee.setName("SK");
        employee.setEmpID("102");
        employee.setDesignation("Test-Designation");
        employee.setSalary(10300);

        return employee;
    }

}
