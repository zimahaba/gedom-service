package com.zimahaba.gedom.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
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
@Table(name = "month")
public class Month extends PersistentEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "nm_month", length = 9, nullable = false)
    private MonthEnum month;

    @Column(name = "nr_month", length = 2, nullable = false)
    private String monthNumber;

    @Column(name = "nr_year", length = 4, nullable = false)
    private Integer year;

    @Column(name = "hr_extra", nullable = false)
    private LocalTime extraHours;

    @Column(name = "hr_holiday", nullable = false)
    private LocalTime holidayHours;

    @Column(name = "fl_closed", nullable = false)
    private Boolean closed;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    @JsonIgnore
    private Employee employee;

    @OneToMany(mappedBy = "month", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Punch> punchList = new ArrayList<>();

    public void addPunch(Punch punch) {
        punchList.add(punch);
        punch.setMonth(this);
    }
}
