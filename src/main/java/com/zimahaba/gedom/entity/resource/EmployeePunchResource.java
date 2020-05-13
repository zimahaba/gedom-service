package com.zimahaba.gedom.entity.resource;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class EmployeePunchResource {

    private Map<Integer, Integer> monthYearMap = new HashMap<>();
    private Integer month;
    private Integer year;
    private List<PunchResource> punchList = new ArrayList<>();
}
