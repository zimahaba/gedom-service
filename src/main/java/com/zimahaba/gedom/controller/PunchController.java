package com.zimahaba.gedom.controller;

import com.zimahaba.gedom.entity.Month;
import com.zimahaba.gedom.entity.MonthEnum;
import com.zimahaba.gedom.entity.Punch;
import com.zimahaba.gedom.entity.resource.EmployeePunchResource;
import com.zimahaba.gedom.service.MonthService;
import com.zimahaba.gedom.service.PunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController("/punch")
public class PunchController {

    @Autowired
    private PunchService punchService;

    @Autowired
    private MonthService monthService;

    @GetMapping("/employeepunch/{employeeId}")
    public ResponseEntity<EmployeePunchResource> getEmployeePunchResource(@PathVariable("employeeId") Long employeeId) {
        return new ResponseEntity<>(punchService.getEmployeePunchResource(1L), HttpStatus.OK) ;
    }

    @GetMapping("/employeepunch/{employeeId}/{month}/{year}")
    public EmployeePunchResource getEmployeePunchResource(@PathVariable("employeeId") Long employeeId,
                                                          @PathVariable("month") Integer month,
                                                          @PathVariable("year") Integer year) {

        return null;
    }

    @GetMapping("/month")
    public String findPunch() {
        monthService.findMonth(1L, MonthEnum.JANUARY, 2020);
        return null;
    }

    @GetMapping("/teste")
    public Month testeInserir() {

        Punch punch = new Punch();
        punch.setDate(LocalDate.now());
        punch.setEntrance(LocalTime.of(7, 0));
        punch.setBreakStart(LocalTime.of(12, 0));
        punch.setBreakEnd(LocalTime.of(13, 0));
        punch.setExit(LocalTime.of(16, 0));
        punch.setHoliday(false);

        Month month = new Month();
        month.setMonth(MonthEnum.FEBRUARY);
        month.setYear(2020);
        month.setExtraHours(LocalTime.of(0, 0));
        month.setHolidayHours(LocalTime.of(0, 0));
        month.setClosed(false);

        month.addPunch(punch);

        Month savedMonth = monthService.save(month);

        return savedMonth;
    }
}
