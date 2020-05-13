package com.zimahaba.gedom.service;

import com.zimahaba.gedom.entity.Employee;
import com.zimahaba.gedom.entity.Month;
import com.zimahaba.gedom.entity.MonthEnum;
import com.zimahaba.gedom.repository.MonthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class MonthService {

    @Autowired
    private MonthRepository repository;

    public Month save(Month month) {
        return repository.save(month);
    }

    public Month findMonth(Long employeeId, MonthEnum month, Integer year) {
        return repository.findOne(Example.of(createMonthExample(employeeId, month, year))).get();
    }

    private Month createMonthExample(Long employeeId, MonthEnum month, Integer year) {
        Employee employeeExample = new Employee();
        employeeExample.setId(employeeId);
        Month monthExample = new Month();
        monthExample.setEmployee(employeeExample);
        monthExample.setMonth(month);
        monthExample.setYear(year);
        return monthExample;
    }
}
