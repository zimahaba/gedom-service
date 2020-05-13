package com.zimahaba.gedom.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "employee")
public class Employee extends PersistentEntity {

    @Column(name = "nm_name", length = 255, nullable = false)
    private String name;

    @Column(name = "nr_cpf", length = 11, nullable = false)
    private String cpf;

    @Column(name = "nr_rg", length = 20)
    private String rg;

    @Column(name = "ds_address", length = 255, nullable = false)
    private String address;

    @Column(name = "dt_birthday", nullable = false)
    private LocalDate birthday;

    @Column(name = "nr_ctps", length = 20, nullable = false)
    private String ctps;

    @Column(name = "vl_salary", nullable = false)
    private BigDecimal salary;

    @Column(name = "ds_role", length = 50, nullable = false)
    private String role;

    @Column(name = "tm_entrance", nullable = false)
    private LocalTime entrance;

    @Column(name = "tm_break_start")
    private LocalTime breakStart;

    @Column(name = "tm_break_end")
    private LocalTime breakEnd;

    @Column(name = "tm_exit", nullable = false)
    private LocalTime exit;

    @ManyToOne
    @JoinColumn(name = "employer_id", nullable = false)
    private Employer employer;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Month> monthList = new ArrayList<>();
}
