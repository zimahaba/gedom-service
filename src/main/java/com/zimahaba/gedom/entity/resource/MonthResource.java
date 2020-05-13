package com.zimahaba.gedom.entity.resource;

import lombok.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class MonthResource {
    private String month;
    private String monthNumber;
    private Integer year;
    private LocalTime extraHours;
    private LocalTime holidayHours;
    private Boolean closed;
    private List<PunchResource> punchList = new ArrayList<>();
}
