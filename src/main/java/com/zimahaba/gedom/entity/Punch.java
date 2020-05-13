package com.zimahaba.gedom.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "punch")
public class Punch extends PersistentEntity {

    @Column(name = "dt_date", nullable = false)
    private LocalDate date;

    @Column(name = "tm_entrance", nullable = false)
    private LocalTime entrance;

    @Column(name = "tm_break_start")
    private LocalTime breakStart;

    @Column(name = "tm_break_end")
    private LocalTime breakEnd;

    @Column(name = "tm_exit", nullable = false)
    private LocalTime exit;

    @Column(name = "fl_holiday", nullable = false)
    private Boolean holiday;

    @ManyToOne
    @JoinColumn(name = "month_id", nullable = false)
    @JsonIgnore
    private Month month;

    public String getWeekDay() {
        return date != null ? date.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR")) : "";
    }

    public String getDay() {
        return date != null ? date.format(DateTimeFormatter.ofPattern("dd/MM")) : "";
    }
}
