package com.zimahaba.gedom.entity.resource;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PunchResource {
    // TODO: check if the date as an object is needed
    private LocalDate date;
    private String weekDay;
    private String day;
    private String entrance;
    private String breakStart;
    private String breakEnd;
    private String exit;
    private Boolean holiday;
}
