package com.zimahaba.gedom.service;

import com.zimahaba.gedom.entity.Employee;
import com.zimahaba.gedom.entity.resource.EmployeeResource;
import com.zimahaba.gedom.entity.resource.MonthResource;
import com.zimahaba.gedom.repository.EmployeeRepository;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private MapperFacade mapper;

    public List<EmployeeResource> findEmployeesByEmployerId(Long employerId) {
        List<Employee> employees = repository.findByEmployerId(employerId);
        return mapper.mapAsList(employees, EmployeeResource.class);
    }

    public List<MonthResource> createMonthResourceList(Long employeeId) {



        return new ArrayList<>();
    }
}
