package com.zimahaba.gedom.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "holiday")
public class Holiday extends PersistentEntity {

    @Column(name = "dt_holiday", nullable = false)
    private LocalDate date;

    @Column(name = "nm_holiday", length = 40, nullable = false)
    private String name;

    @Column(name = "ds_holiday", length = 255)
    private String description;
}
