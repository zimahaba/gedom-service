package com.zimahaba.gedom.entity.resource;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class EmployeeResource {
    private Long id;
    private String name;
    private String cpf;
    private String rg;
    private String address;
    private LocalDate birthday;
    private String ctps;
    private BigDecimal salary;
    private String role;
    private LocalTime entrance;
    private LocalTime breakStart;
    private LocalTime breakEnd;
    private LocalTime exit;
}
