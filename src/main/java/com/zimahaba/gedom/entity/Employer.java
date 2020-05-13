package com.zimahaba.gedom.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "employer")
public class Employer extends PersistentEntity {

    @Column(name = "nm_name", length = 255, nullable = false)
    private String name;

    @Column(name = "nr_cpf", length = 11, nullable = false)
    private String cpf;

    @Column(name = "ds_address", length = 255, nullable = false)
    private String address;

    @Column(name = "dt_birthday", nullable = false)
    private LocalDate birthday;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "employer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employeeList = new ArrayList<>();
}
