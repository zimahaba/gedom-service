package com.zimahaba.gedom.service;

import com.zimahaba.gedom.entity.Month;
import com.zimahaba.gedom.entity.MonthEnum;
import com.zimahaba.gedom.entity.Punch;
import com.zimahaba.gedom.entity.resource.EmployeePunchResource;
import com.zimahaba.gedom.entity.resource.PunchResource;
import com.zimahaba.gedom.repository.PunchRepository;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PunchService {

    @Autowired
    private PunchRepository repository;

    @Autowired
    private MonthService monthService;

    @Autowired
    private MapperFacade mapperFacade;

    public Punch save(Punch punch) {return repository.save(punch);}

    public Month saveMonth(Month month) {
        return monthService.save(month);
    }

    public EmployeePunchResource getEmployeePunchResource(Long employeeId) {

        Month currentEmployeeMonth = monthService.findMonth(employeeId, MonthEnum.get(LocalDate.now().getMonth().getValue()),
                LocalDate.now().getYear());
        if (currentEmployeeMonth == null) {
            // create new month
        }

        return this.getEmployeePunchResource(employeeId, MonthEnum.get(LocalDate.now().getMonth().getValue()),
                LocalDate.now().getYear());
    }

    public EmployeePunchResource getEmployeePunchResource(Long employeeId, MonthEnum monthEnum, Integer year) {

        Month month = monthService.findMonth(employeeId, monthEnum, year);
        EmployeePunchResource employeePunchResource = null;
        if (month != null) {

            employeePunchResource = new EmployeePunchResource();
            employeePunchResource.setMonth(month.getMonth().getValue());
            employeePunchResource.setYear(month.getYear());

            List<PunchResource> punchResourceList = mapperFacade.mapAsList(month.getPunchList(), PunchResource.class);
            employeePunchResource.getPunchList().addAll(punchResourceList);

        }

        return employeePunchResource;
    }

}
