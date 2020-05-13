package com.zimahaba.gedom.controller;

import com.zimahaba.gedom.entity.resource.EmployeeResource;
import com.zimahaba.gedom.entity.resource.MonthResource;
import com.zimahaba.gedom.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<EmployeeResource> getEmployees() {
        // TODO: get logged user and find employee by EmployerId
        return employeeService.findEmployeesByEmployerId(1L);
    }

    @GetMapping("/employee-punch")
    public List<MonthResource> getMonthList() {
        return new ArrayList<>();
    }
}
